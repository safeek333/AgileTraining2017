package com.first.gradletest.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	long rollNumber;
	String name;
	String course;
	EnrollmentDetail enrollmentDetail;
	public long getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public EnrollmentDetail getEnrollmentDetail() {
		return enrollmentDetail;
	}
	public void setEnrollmentDetail(EnrollmentDetail enrollmentDetail) {
		this.enrollmentDetail = enrollmentDetail;
	}
	
	
}
