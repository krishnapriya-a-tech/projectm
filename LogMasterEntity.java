package com.projectmanagement.log.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.projectmanagement.SequenceGenerator.StringPrefixedSequenceGenerator;
import com.projectmanagement.constants.AppConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "task_time_log")
@EntityListeners(AuditingEntityListener.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LogMasterEntity {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
	@GenericGenerator(name = "generator", strategy = "com.projectmanagement.SequenceGenerator.StringPrefixedSequenceGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceGenerator.VALUE_PREFIX_PARAMETER, value = AppConstants.LOG_PREFIX_VALUE),
			@Parameter(name = StringPrefixedSequenceGenerator.NUMBER_FORMATE_PARAMETER, value = AppConstants.NUMBER_FORMAT_VALUE) })

	@Id
	private String logId;

	private LocalDateTime date;

	private String project;

	private String taskactivity;

	private String worktype;

	private double duration;

	private boolean billable;

	private String describtion;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;
	
	private String userId;
	
	private LocalDate createdDate;

}