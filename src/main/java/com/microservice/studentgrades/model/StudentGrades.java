package com.microservice.studentgrades.model;

public class StudentGrades {

	private int id;
	private String subjectName;
	private int grade;
	private String index;
	
	public StudentGrades() {
	}
	
	public StudentGrades(int id, String subjectName, int grade, String index) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.grade = grade;
		this.index = index;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
