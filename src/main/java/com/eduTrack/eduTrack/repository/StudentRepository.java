package com.eduTrack.eduTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduTrack.eduTrack.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
