package com.self.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.self.entity.CourseEntity;

public interface CourseService {
	
	public List<CourseEntity> getAllCourses();
	
	public CourseEntity addCourse(CourseEntity course);
	
	public CourseEntity updateCourse(CourseEntity course);
	
	public void deleCourse(int id);

}
