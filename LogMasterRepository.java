package com.projectmanagement.log.repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.log.dao.LogMasterDAO;
import com.projectmanagement.log.dto.LogMasterDTO;
import com.projectmanagement.log.entity.LogMasterEntity;
import com.projectmanagement.log.mapper.LogMasterMapper;

@Component
public class LogMasterRepository {

	@Autowired
	private LogMasterDAO lmDAO;

	private static final Logger logger = LoggerFactory.getLogger(LogMasterRepository.class);
	
	//Create new Log

	public Map<String, Object> addOrUpdateLogMaster(LogMasterDTO lmDTO) throws Exception {
		Map<String, Object> response = new LinkedHashMap<>();

		try {
			if (lmDTO.getLogId() == null) {
				logger.info("Creating new log entry...");

				LogMasterEntity lmEntity = LogMasterMapper.addLogMaster(lmDTO, new LogMasterEntity());
				lmDAO.save(lmEntity);

				logger.info("Log created with ID: {}", lmEntity.getLogId());

				response.put("status", "success");
				response.put("id", lmEntity.getLogId());
				response.put("message", "Log has been created successfully");

			} else {
				logger.info("Updating existing log with ID: {}", lmDTO.getLogId());

				LogMasterEntity lmEntity = lmDAO.findBylogId(lmDTO.getLogId());
				LogMasterMapper.addLogMaster(lmDTO, lmEntity);
				lmDAO.save(lmEntity);

				logger.info("Log updated with ID: {}", lmEntity.getLogId());

				response.put("status", "success");
				response.put("id", lmEntity.getLogId());
				response.put("message", "Log has been updated successfully");
			}

		} catch (Exception e) {
			logger.error("Error occurred while saving/updating log: {}", e.getMessage(), e);
			throw new Exception("Failed to create Log", e);
		}

		return response;
	}

	// deleted log 
	
	public Map<String, Object> deleteLogMasterById(String logId) {
		Map<String, Object> response = new HashMap<>();

		try {
			logger.info("Attempting to delete log with ID: {}", logId);

			LogMasterEntity lmEnt = lmDAO.findBylogId(logId);

			if (lmEnt != null) {
				lmDAO.deleteById(logId);
				logger.info("Log with ID: {} deleted successfully", logId);

				response.put("status", "success");
				response.put("message", "Log data deleted successfully");
			} else {
				logger.warn("Log ID not found: {}", logId);

				response.put("status", "failed");
				response.put("message", "Log ID not found");
			}
		} catch (Exception e) {
			logger.error("Failed to delete log with ID {}: {}", logId, e.getMessage(), e);
			throw new RuntimeException("Failed to delete advisor", e);
		}

		return response;
	}
	
	
	// Get log details by userId
	public Map<String, Object> getLogDetails(String userId) throws Exception {

	    Map<String, Object> response = new HashMap<>();

	    try {
	        logger.info("Fetching log details for userId: {}", userId);

	        List<LogMasterEntity> logUser = lmDAO.findLogDetailsByUserId(userId);

	        if (logUser == null || logUser.isEmpty()) {
	            logger.warn("No logs found for userId: {}", userId);
	            response.put("status", "failed");
	            response.put("message", "No logs found for userId: " + userId);
	        } else {
	            logger.info("Found {} logs for userId: {}", logUser.size(), userId);
	            response.put("status", "success");
	            response.put("count", logUser.size());
	            response.put("LogUser", logUser);
	        }

	    } catch (Exception e) {
	        logger.error("Error retrieving logs for userId: {} - {}", userId, e.getMessage(), e);
	        throw new Exception("Error retrieving logs for userId: " + userId, e);
	    }

	    return response;
	}



	
}































