package com.ashok.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.course.entity.Course;
import com.ashok.course.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add")
	public ResponseEntity<Course> addCourse(@RequestBody Course course){
		Course courseDetails=courseService.addCourse(course);
		return new ResponseEntity<Course>(courseDetails,HttpStatus.CREATED);
	}
	
	
}
