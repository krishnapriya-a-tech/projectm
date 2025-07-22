package com.projectmanagement.task.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskMasterDTO {

	private String taskId;

	private String taskTitle;

	private String description;

	private String taskType;

	private String project;

	private String status;

	private String assignee;

	private LocalDate dueDate;

	private double estimatedHours;

	private String priority;

}
