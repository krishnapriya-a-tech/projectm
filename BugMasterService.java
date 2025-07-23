package com.projectmanagement.bug.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectmanagement.bug.dto.BugMasterDTO;
import com.projectmanagement.bug.repository.BugMasterRepository;

@Component
public class BugMasterService {

	@Autowired
	private BugMasterRepository bmRepo;

	public Map<String, Object> addOrUpdateBugMaster(BugMasterDTO bmDTO) throws Exception {
		return this.bmRepo.addOrUpdateBugMaster(bmDTO);
	}
	
	//delete 

	public Map<String, Object> deleteBugById(String bugId) throws Exception {
		return this.bmRepo.deleteBugMasterById(bugId);
		
	}

}
