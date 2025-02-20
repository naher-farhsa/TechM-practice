package com.naher_farhsa.TechM_Practice.repository;

import com.naher_farhsa.TechM_Practice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,String> {
}
