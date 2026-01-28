package com.eduTrack.eduTrack.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Enrollment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	private LocalDate enrolleDate;
}
