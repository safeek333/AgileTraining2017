package com.first.gradletest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.gradletest.model.Course;
import com.first.gradletest.model.EnrollmentDetail;
import com.first.gradletest.model.Student;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	@Autowired
	Student student;
	
	@Autowired
	Course course;
	
	@Autowired
	EnrollmentDetail enrollmentDetail;
	
	@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student hello(){
		enrollmentDetail.setCourse(course);
		student.setEnrollmentDetail(enrollmentDetail);
		return student;
	}
}
