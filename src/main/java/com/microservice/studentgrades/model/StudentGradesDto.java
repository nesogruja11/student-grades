package com.microservice.studentgrades.model;

import java.util.List;

public class StudentGradesDto {

	private List<StudentGrades> studentGrades;
	
	public StudentGradesDto() {}
	
	public StudentGradesDto(List<StudentGrades> studentGrades) {
		super();
		this.studentGrades = studentGrades;
	}

	public List<StudentGrades> getStudentGrades() {
		return studentGrades;
	}

	public void setStudentGrades(List<StudentGrades> studentGrades) {
		this.studentGrades = studentGrades;
	}
}
