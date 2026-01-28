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

import com.eduTrack.eduTrack.entity.Course;
import com.eduTrack.eduTrack.service.CourseService;

@RestController
@RequestMapping("api/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody Course course){
		Course savedCourse = courseService.saveCourse(course);
		return ResponseEntity.ok(savedCourse);
	}
	
	@GetMapping
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseService.getAllCourses();
		return ResponseEntity.ok(allCourses);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable Long id){
		Course courseById = courseService.getCourseById(id);
		return ResponseEntity.ok(courseById);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Course> deleteCourse(@PathVariable Long id){
		courseService.deleteCourse(id);
		return ResponseEntity.noContent().build();
		
	}

}
