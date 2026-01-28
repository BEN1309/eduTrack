package com.eduTrack.eduTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduTrack.eduTrack.entity.Enrollment;
import com.eduTrack.eduTrack.service.EnrollmentService;

@RestController
@RequestMapping("/api/enroll")
public class EnrollmentController {

	@Autowired
	private EnrollmentService enrollmentService;

	@PostMapping
	ResponseEntity<Enrollment> createEnrollment(@RequestBody Enrollment enrollment) {
		Enrollment saveEnrollment = enrollmentService.saveEnrollment(enrollment);
		return ResponseEntity.ok(saveEnrollment);
	}
	
	@GetMapping
	ResponseEntity<List<Enrollment>> getAllEnrollments(){
		List<Enrollment> allEnrollments = enrollmentService.getAllEnrollments();
		return ResponseEntity.ok(allEnrollments);				
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Enrollment> getEnrollmentById(@PathVariable Long id){
		Enrollment enrollmentById = enrollmentService.getEnrollmentById(id);
		return ResponseEntity.ok(enrollmentById);
	} 
	
	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteEnrollment(@PathVariable Long id){
		enrollmentService.deleteEnrollment(id);
		return ResponseEntity.noContent().build();
	}
	
}
