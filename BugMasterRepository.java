package com.projectmanagement.bug.repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.bug.dao.BugMasterDAO;
import com.projectmanagement.bug.dto.BugMasterDTO;
import com.projectmanagement.bug.entity.BugMasterEntity;
import com.projectmanagement.bug.mapper.BugMasterMapper;
import com.projectmanagement.constants.AppConstants;

@Component
public class BugMasterRepository {

	@Autowired
	private BugMasterDAO bmDAO;

	private static final Logger logger = LoggerFactory.getLogger(BugMasterRepository.class);

	public Map<String, Object> addOrUpdateBugMaster(BugMasterDTO bmDTO) throws Exception {

		Map<String, Object> response = new LinkedHashMap<>();

		try {
			logger.info("Entering addOrUpdateBugMaster with DTO: {}", bmDTO);

			if (bmDTO.getBugId() == null) {
				logger.info("Creating new BugMaster task...");

				BugMasterEntity bmEntity = BugMasterMapper.addBugMaster(bmDTO, new BugMasterEntity());
				bmDAO.save(bmEntity);

				response.put("status", "success");
				response.put("id", bmEntity.getTaskId());
				response.put("message", "Task has been created successfully");

				logger.info("New BugMaster task created with ID: {}", bmEntity.getTaskId());

			} else {
				logger.info("Updating existing BugMaster task with ID: {}", bmDTO.getTaskId());

				BugMasterEntity bmEntity = bmDAO.findBytaskId(bmDTO.getTaskId());
				BugMasterMapper.addBugMaster(bmDTO, bmEntity);
				bmDAO.save(bmEntity);

				response.put("status", "success");
				response.put("id", bmEntity.getTaskId());
				response.put("message", "Task has been updated successfully");

				logger.info("BugMaster task updated with ID: {}", bmEntity.getTaskId());
			}

		} catch (Exception e) {
			logger.error("Exception in addOrUpdateBugMaster: ", e);
			throw new Exception("Failed to create task", e);
		}

		logger.info("addOrUpdateBugMaster response: {}", response);
		return response;
	}

	
	//delete Method
	
	public Map<String, Object> deleteBugMasterById(String bugId) {
	    Map<String, Object> response = new HashMap<>();

	    try {
	        logger.info("Attempting to delete BugMaster with ID: {}", bugId);
	        BugMasterEntity bmEnt = bmDAO.findByBugId(bugId);

	        if (bmEnt != null && bmEnt != null) {
	            bmDAO.deleteById(bugId);
	            logger.info("Successfully deleted BugMaster with ID: {}", bugId);

//	            response.put(AppConstants.STATUS, AppConstants.SUCCESS);
//	            response.put(com.projectmanagement.constants.AppConstants.MESSAGE, com.projectmanagement.constants.AppConstants.BUG_DATA_DELETED);
	            response.put("status", "success");
	            response.put("message", "Bug data deleted successfully");
	        } else {
	            logger.warn("BugMaster with ID {} not found", bugId);

//	            response.put(com.projectmanagement.constants.AppConstants.STATUS, com.projectmanagement.constants.AppConstants.FAILED);
//	            response.put(com.projectmanagement.constants.AppConstants.MESSAGE, com.projectmanagement.constants.AppConstants.BUG_ID_NOT_FOUND);
	            
	            response.put("status", "failed");
	            response.put("message", "Bug ID not found");
	        }
	    } catch (Exception e) {
	        logger.error("Error occurred while deleting BugMaster with ID: {}", bugId, e);
	        throw new RuntimeException("Failed to delete advisor", e);
	    }

	    return response;
	}


}























