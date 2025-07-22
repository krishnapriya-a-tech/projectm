package com.projectmanagement.task.controller;

import com.projectmanagement.task.dto.TaskMasterDTO;
import com.projectmanagement.task.service.TaskMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/taskMaster")
public class TaskMasterController {

	@Autowired
	private TaskMasterService taskService;

	@PostMapping("/createTask")
	public Map<String, Object> createTask(@RequestBody TaskMasterDTO amDTO) throws Exception {
		return this.taskService.createTask(amDTO);
	}

	// Update customer
	@PostMapping("/UpdateTask")
	public Map<String, Object> UpdateTask(@RequestBody TaskMasterDTO utDTO) throws Exception {
		return this.taskService.updateTask(utDTO);
	}

}
