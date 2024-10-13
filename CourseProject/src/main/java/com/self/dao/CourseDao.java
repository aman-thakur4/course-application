package com.self.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.self.entity.CourseEntity;

public interface CourseDao extends JpaRepository<CourseEntity, Integer>{

}
