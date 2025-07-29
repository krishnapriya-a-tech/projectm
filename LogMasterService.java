package com.projectmanagement.log.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.log.dto.LogMasterDTO;
import com.projectmanagement.log.repository.LogMasterRepository;

@Component
public class LogMasterService {

	@Autowired
	private LogMasterRepository lmRepo;

	public Map<String, Object> addOrUpdateLogMaster(LogMasterDTO lmDTO) throws Exception {
		return this.lmRepo.addOrUpdateLogMaster(lmDTO);
	}

	// delete

	public Map<String, Object> deleteLogById(String logId) throws Exception {
		return this.lmRepo.deleteLogMasterById(logId);

	}
	
	// Get Log Details
	public Map<String, Object> getLogDetails(String userId) throws Exception {
	    return this.lmRepo.getLogDetails(userId);
	}


}
