package com.projectmanagement.task.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.task.dao.TaskMasterDAO;
import com.projectmanagement.task.dto.TaskMasterDTO;
import com.projectmanagement.task.entity.TaskMasterEntity;
import com.projectmanagement.task.entity.TaskMasterMapper;

@Component
public class TaskMasterRepository {

	@Autowired
	private TaskMasterDAO tmDAO;

	private static final Logger logger = LoggerFactory.getLogger(TaskMasterRepository.class);

	public Map<String, Object> createTask(TaskMasterDTO tmDTO) throws Exception {
		Map<String, Object> response = new LinkedHashMap<>();

		try {
			logger.info("Creating task with data: {}", tmDTO);

			TaskMasterEntity tmEntity = TaskMasterMapper.addTaskMaster(tmDTO, new TaskMasterEntity());

			tmDAO.save(tmEntity);

			logger.info("Task saved with ID: {}", tmEntity.getTaskId());

			response.put("status", "success");
			response.put("id", tmEntity.getTaskId());
			response.put("message", "Task has been created successfully");

			logger.info("Task creation response: {}", response);
		} catch (Exception e) {
			logger.error("Error while creating task: {}", e.getMessage(), e);
			throw new Exception("Failed to create task", e);
		}

		return response;
	}
	
	public Map<String, Object> updateTask(TaskMasterDTO utDTO) throws Exception {
	    Map<String, Object> response = new LinkedHashMap<>();

	    try {
	        logger.info("Updating task with data: {}", utDTO);

	        // Validate taskId presence
	        if (utDTO.getTaskId() == null || !tmDAO.existsById(utDTO.getTaskId())) {
	            response.put("status", "error");
	            response.put("message", "Task not found with ID: " + utDTO.getTaskId());
	            return response;
	        }

	        // Get existing task
	        TaskMasterEntity existingEntity = tmDAO.findById(utDTO.getTaskId()).orElseThrow(() ->
	                new Exception("Task not found with ID: " + utDTO.getTaskId()));

	        // Update fields
	        TaskMasterEntity updatedEntity = TaskMasterMapper.addTaskMaster(utDTO, existingEntity);

	        // Save updated task
	        tmDAO.save(updatedEntity);

	        logger.info("Task updated with ID: {}", updatedEntity.getTaskId());

	        response.put("status", "success");
	        response.put("id", updatedEntity.getTaskId());
	        response.put("message", "Task has been updated successfully");

	    } catch (Exception e) {
	        logger.error("Error while updating task: {}", e.getMessage(), e);
	        throw new Exception("Failed to update task", e);
	    }

	    return response;
	}

}
