package com.naher_farhsa.TechM_Practice.repository;

import com.naher_farhsa.TechM_Practice.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment ,String> {
}
