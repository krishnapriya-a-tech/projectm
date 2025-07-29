package com.projectmanagement.log.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectmanagement.log.dto.LogMasterDTO;
import com.projectmanagement.log.service.LogMasterService;


@RestController
@RequestMapping("/api/logmaster")

public class LogMasterController {
	
	@Autowired
	private LogMasterService logService;

	@PostMapping("/addOrUpdateLog")
	public Map<String, Object> addOrUpdatelogMaster(@RequestBody LogMasterDTO lmDTO) throws Exception {
		return this.logService.addOrUpdateLogMaster(lmDTO);
	}

	@DeleteMapping("/deleteLogById/{logId}")
	public Map<String, Object> deleteLogById(@PathVariable String logId) throws Exception {
		return this.logService.deleteLogById(logId);
	}
	
	// Get log details by userId
	@GetMapping("/getLogByUserId/{userId}")
	public Map<String, Object> getLogByUserId(@PathVariable String userId) throws Exception {
	    return logService.getLogDetails(userId);
	}


}
