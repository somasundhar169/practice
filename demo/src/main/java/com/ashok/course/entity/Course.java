package com.ashok.course.entity;

import java.math.BigInteger;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	private BigInteger price;
	private BigInteger duration;
	private String image;
}
