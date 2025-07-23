package com.projectmanagement.bug.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectmanagement.bug.dto.BugMasterDTO;
import com.projectmanagement.bug.service.BugMasterService;

@RestController
@RequestMapping("/api/bugmaster")
public class BugMasterController {

	@Autowired
	private BugMasterService bugService;

	@PostMapping("/addOrUpdatebug")
	public Map<String, Object> addOrUpdatebugMaster(@RequestBody BugMasterDTO bmDTO) throws Exception {
		return this.bugService.addOrUpdateBugMaster(bmDTO);
	}
	
	@DeleteMapping("/deleteBugById/{bugId}")
	public Map<String, Object> deleteBugById(@PathVariable String bugId) throws Exception {
		return this.bugService.deleteBugById(bugId);
	}

}
