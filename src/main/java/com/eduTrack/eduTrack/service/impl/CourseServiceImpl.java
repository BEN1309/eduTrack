package com.eduTrack.eduTrack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduTrack.eduTrack.entity.Course;
import com.eduTrack.eduTrack.repository.CourseRepository;
import com.eduTrack.eduTrack.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElseThrow();
	}

	@Override
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}

}
