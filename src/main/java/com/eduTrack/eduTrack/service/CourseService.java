package com.eduTrack.eduTrack.service;

import java.util.List;

import com.eduTrack.eduTrack.entity.Course;

public interface CourseService {
	
	Course saveCourse(Course course);
	
	List<Course> getAllCourses();
	
	Course getCourseById(Long id);
	
	void deleteCourse(Long id);
	
}
