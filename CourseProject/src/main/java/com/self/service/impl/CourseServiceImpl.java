package com.self.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.dao.CourseDao;
import com.self.entity.CourseEntity;
import com.self.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	CourseDao dao;
	
	@Override
	public CourseEntity addCourse(CourseEntity course) {
		
		return dao.save(course);
	}

	
	@Override
	public List<CourseEntity> getAllCourses() {
		 
		return dao.findAll();
	}


	@Override
	public CourseEntity updateCourse(CourseEntity course) {
		
		return dao.save(course);
	}


	@Override
	public void deleCourse(int id) {//4
		CourseEntity idobj= dao.getOne(id);//4 desc title
		dao.delete(idobj);
		
	}


	

	

}
