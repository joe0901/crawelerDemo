package com.guodian.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guodian.pojo.JobInfo;

public interface JobInfoDao extends JpaRepository<JobInfo,Long> {

}
