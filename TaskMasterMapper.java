package com.projectmanagement.task.entity;

import java.time.LocalDateTime;

import com.projectmanagement.task.dto.TaskMasterDTO;

public class TaskMasterMapper {

	public static TaskMasterEntity addTaskMaster(TaskMasterDTO tmDTO, TaskMasterEntity taskMasterEntity) {

		taskMasterEntity.setTaskTitle(tmDTO.getTaskTitle());
		taskMasterEntity.setDescription(tmDTO.getDescription());
		taskMasterEntity.setTaskType(tmDTO.getTaskType());
		taskMasterEntity.setProject(tmDTO.getProject());
		taskMasterEntity.setStatus(tmDTO.getStatus());
		taskMasterEntity.setAssignee(tmDTO.getAssignee());
		taskMasterEntity.setDueDate(tmDTO.getDueDate());
		taskMasterEntity.setEstimatedHours(tmDTO.getEstimatedHours());
		taskMasterEntity.setPriority(tmDTO.getPriority());
		taskMasterEntity.setCreatedAt(LocalDateTime.now());
		taskMasterEntity.setUpdatedAt(LocalDateTime.now());

		return taskMasterEntity;
	}

}
