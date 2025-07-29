package com.projectmanagement.log.mapper;

import java.time.LocalDateTime;

import com.projectmanagement.log.dto.LogMasterDTO;
import com.projectmanagement.log.entity.LogMasterEntity;

public class LogMasterMapper {

	public static LogMasterEntity addLogMaster(LogMasterDTO lmDTO, LogMasterEntity logMasterEntity) {

		logMasterEntity.setDate(lmDTO.getDate());

		logMasterEntity.setProject(lmDTO.getProject());

		logMasterEntity.setTaskactivity(lmDTO.getTaskactivity());

		logMasterEntity.setWorktype(lmDTO.getWorktype());

		logMasterEntity.setDuration(lmDTO.getDuration());

		logMasterEntity.setBillable(lmDTO.isBillable());

		logMasterEntity.setDescribtion(lmDTO.getDescribtion());

		logMasterEntity.setCreatedAt(LocalDateTime.now());

		logMasterEntity.setUpdatedAt(LocalDateTime.now());
		
		logMasterEntity.setUserId(lmDTO.getUserId());
		
		logMasterEntity.setCreatedDate(lmDTO.getCreatedDate());

		return logMasterEntity;
	}

}
