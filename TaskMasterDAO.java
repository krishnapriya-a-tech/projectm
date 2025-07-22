package com.projectmanagement.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectmanagement.task.entity.TaskMasterEntity;

public interface TaskMasterDAO extends JpaRepository<TaskMasterEntity, String> {

}
