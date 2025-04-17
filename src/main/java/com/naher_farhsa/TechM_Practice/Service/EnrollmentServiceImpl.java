package com.naher_farhsa.TechM_Practice.Service;

import com.naher_farhsa.TechM_Practice.entity.Enrollment;
import com.naher_farhsa.TechM_Practice.repository.EnrollmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepo enrollmentRepo;
    public int insertEnrollment(Enrollment e) {
        enrollmentRepo.save(e);
        return 1;
    }
    public int updateEnrollment(Enrollment s, String id,String cid) {
        return 0;
    }
    public int deleteEnrollment(String id, String cid) {
        return 0;
    }
    public List<Enrollment> fetchAll(){
        return null;
    }
    public Enrollment fetchOneEnrollment(String id, String cid) {
        return null;
    }

}
