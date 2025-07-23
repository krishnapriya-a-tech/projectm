package com.projectmanagement.bug.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BugMasterDTO {
	
	private String bugId;

	private String project;

	private String taskId;

	private String title;

	private String description;

	private String status;

	private String priority;

	private String environment;

	private String expectedResult;

	private String actualResult;

}
