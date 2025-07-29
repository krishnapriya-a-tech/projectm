package com.projectmanagement.log.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogMasterDTO {
	
	private String logId;
	
	private LocalDateTime date;

	private String project;

	private String taskactivity;

	private String worktype;

	private double duration;
	
	private boolean billable;

	private String describtion;
	
	private String userId;
	
	private LocalDate createdDate;

}
