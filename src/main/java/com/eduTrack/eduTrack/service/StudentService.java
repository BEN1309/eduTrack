package com.eduTrack.eduTrack.service;

import java.util.List;

import com.eduTrack.eduTrack.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(Long id);
	
	void deleteStudent(Long id);
}
