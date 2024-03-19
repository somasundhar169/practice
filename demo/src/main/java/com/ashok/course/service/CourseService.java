package com.ashok.course.service;

import org.springframework.stereotype.Service;

import com.ashok.course.entity.Course;
import com.ashok.course.repository.CourseRepository;

@Service
public class CourseService {
	
	private CourseRepository courseRepo;

	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}
	

}
