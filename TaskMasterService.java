package com.projectmanagement.task.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.task.dto.TaskMasterDTO;
import com.projectmanagement.task.repository.TaskMasterRepository;

@Component
public class TaskMasterService {
	
	@Autowired
	private TaskMasterRepository tmRepo;

	public Map<String, Object> createTask(TaskMasterDTO tmDTO) throws Exception {
		return this.tmRepo.createTask(tmDTO);
	}
	
	public Map<String, Object> updateTask(TaskMasterDTO utDTO) throws Exception {
		return this.tmRepo.updateTask(utDTO);
	}

}
