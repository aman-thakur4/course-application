package com.self.controller;

import org.springframework.web.bind.annotation.RestController;

import com.self.entity.CourseEntity;
import com.self.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@PostMapping("/add-course")
	public CourseEntity addCourse(@RequestBody CourseEntity course) 
	{
		return service.addCourse(course);
		
	}
	
	
	@GetMapping("/get-all-course")
	public List<CourseEntity> getAllCourses() {
		return service.getAllCourses();
	}
	
	@PutMapping("/update-course")
	public CourseEntity updateCourse(@RequestBody CourseEntity course) 
	{
		return service.updateCourse(course);
	}

	
	@DeleteMapping("/delete-course/{id}")
	public ResponseEntity<HttpStatus> deleCourse(@PathVariable int id)
	{ 
		try {
			  service.deleCourse(id) ;
			  return new ResponseEntity<>(HttpStatus.OK);
		} 
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
