package com.eduTrack.eduTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduTrack.eduTrack.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
