package com.ashok.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	

}
