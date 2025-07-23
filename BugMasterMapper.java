package com.projectmanagement.bug.mapper;

import java.time.LocalDateTime;

import com.projectmanagement.bug.dto.BugMasterDTO;
import com.projectmanagement.bug.entity.BugMasterEntity;

public class BugMasterMapper {

	public static BugMasterEntity addBugMaster(BugMasterDTO bmDto, BugMasterEntity BugMasterEntity) {
		
		
		BugMasterEntity.setProject(bmDto.getProject());
		BugMasterEntity.setTaskId(bmDto.getTaskId());
		BugMasterEntity.setTitle(bmDto.getTitle());
		BugMasterEntity.setDescription(bmDto.getDescription());
		BugMasterEntity.setStatus(bmDto.getStatus());
		BugMasterEntity.setPriority(bmDto.getPriority());
		BugMasterEntity.setEnvironment(bmDto.getEnvironment());
		BugMasterEntity.setExpectedResult(bmDto.getExpectedResult());
		BugMasterEntity.setActualResult(bmDto.getActualResult());
		BugMasterEntity.setCreatedAt(LocalDateTime.now());
		BugMasterEntity.setUpdatedAt(LocalDateTime.now());

		return BugMasterEntity;
	}

}
