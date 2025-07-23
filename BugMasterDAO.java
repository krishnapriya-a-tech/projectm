package com.projectmanagement.bug.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projectmanagement.bug.entity.BugMasterEntity;

public interface BugMasterDAO extends JpaRepository<BugMasterEntity, String> {

	@Query("SELECT c FROM BugMasterEntity c WHERE c.taskId = :taskId")

	BugMasterEntity findBytaskId(@Param("taskId") String taskId);
	
	// deleteBugMasterById addOrUpdateBugMaster viewUserById
		@Query("SELECT a FROM BugMasterEntity a WHERE a.bugId = :bugId")
		BugMasterEntity findByBugId(@Param("bugId") String advisorId);


}
