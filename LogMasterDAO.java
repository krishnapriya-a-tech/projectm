package com.projectmanagement.log.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projectmanagement.log.entity.LogMasterEntity;

public interface LogMasterDAO extends JpaRepository<LogMasterEntity, String> {

	@Query("SELECT c FROM LogMasterEntity c WHERE c.logId = :logId")
	LogMasterEntity findBylogId(@Param("logId") String logId);
	
	// Get log details by userId
	@Query("SELECT c FROM LogMasterEntity c WHERE c.userId = :userId")
	List<LogMasterEntity> findLogDetailsByUserId(@Param("userId") String userId);


}
