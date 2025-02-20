package com.naher_farhsa.TechM_Practice.Service;

import com.naher_farhsa.TechM_Practice.entity.Enrollment;
import com.naher_farhsa.TechM_Practice.entity.Student;

import java.util.List;

public interface EnrollmentService {

    public int insertEnrollment(Enrollment s);
    public int updateEnrollment(Enrollment s, String id,String cid);
    public int deleteEnrollment(String id, String cid);
    public List<Enrollment> fetchAll();
    public Enrollment fetchOneEnrollment(String id, String cid);
}
