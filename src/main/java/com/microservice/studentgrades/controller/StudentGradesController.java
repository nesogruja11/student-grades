package com.microservice.studentgrades.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.studentgrades.model.StudentGrades;
import com.microservice.studentgrades.model.StudentGradesDto;


@RestController
@RequestMapping("/student-grades")
public class StudentGradesController {

	private static List<StudentGrades> studentGrades = Arrays.asList(new StudentGrades(1, "Elektromagnetika 1", 8, "1123"),
			new StudentGrades(1, "Matematika 1", 7, "1123"),
			new StudentGrades(1, "Matematika 2", 6, "1123"),
			new StudentGrades(1, "Matematika 3", 9, "1124"),
			new StudentGrades(1, "Osnove elektrotehnike 1", 10, "1124"),
			new StudentGrades(1, "Uvod u programiranje", 8, "1124"),
			new StudentGrades(1, "Objektno orijentisano programirnaje", 9, "1125"),
			new StudentGrades(1, "Programski prevodioci", 10, "1125"),
			new StudentGrades(1, "Energetska elektronika", 7, "1125"),
			new StudentGrades(1, "Digitalna elektronika", 7, "1126"),
			new StudentGrades(1, "Osnove elektotehnike 1", 8, "1126"),
			new StudentGrades(1, "Matematika 1", 8, "1126"));
	

	@GetMapping("/all")
	public List<StudentGrades> findAll(){
		return studentGrades;
	}
	
	@GetMapping
	public StudentGradesDto findByIndex(@RequestParam("index") String index) throws Exception{
		StudentGradesDto studentGradesDto = new StudentGradesDto();
		studentGradesDto.setStudentGrades(studentGrades.stream().filter(e -> e.getIndex().equals(index)).collect(Collectors.toList()));
		return studentGradesDto;
	}
}
