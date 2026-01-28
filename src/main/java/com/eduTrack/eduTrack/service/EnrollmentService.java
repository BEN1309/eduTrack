package com.eduTrack.eduTrack.service;

import java.util.List;

import com.eduTrack.eduTrack.entity.Enrollment;

public interface EnrollmentService {
	
	Enrollment saveEnrollment(Enrollment enrollment);
	
	List<Enrollment> getAllEnrollments();
	
	Enrollment getEnrollmentById(Long id);
	
	void deleteEnrollment(Long id);
	
}
