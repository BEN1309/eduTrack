package com.eduTrack.eduTrack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduTrack.eduTrack.entity.Enrollment;
import com.eduTrack.eduTrack.repository.EnrollmentRepository;
import com.eduTrack.eduTrack.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
	
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	@Override
	public Enrollment saveEnrollment(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}

	@Override
	public List<Enrollment> getAllEnrollments() {
		return enrollmentRepository.findAll();
	}

	@Override
	public Enrollment getEnrollmentById(Long id) {
		return enrollmentRepository.findById(id)
						.orElseThrow(()-> new RuntimeException("Enrollment not found with id: "+ id));
	}

	@Override
	public void deleteEnrollment(Long id) {
		enrollmentRepository.deleteById(id);
		
	}

}
