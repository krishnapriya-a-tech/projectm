package com.projectmanagement.bug.entity;

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
@Table(name = "bug_master")
@EntityListeners(AuditingEntityListener.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BugMasterEntity {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
	@GenericGenerator(name = "generator", strategy = "com.projectmanagement.SequenceGenerator.StringPrefixedSequenceGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixedSequenceGenerator.VALUE_PREFIX_PARAMETER, value = AppConstants.BUG_PREFIX_VALUE),
			@Parameter(name = StringPrefixedSequenceGenerator.NUMBER_FORMATE_PARAMETER, value = AppConstants.NUMBER_FORMAT_VALUE) })

	@Id
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

//	@CreatedDate
	private LocalDateTime createdAt;

//	@LastModifiedDate
	private LocalDateTime updatedAt;

}
