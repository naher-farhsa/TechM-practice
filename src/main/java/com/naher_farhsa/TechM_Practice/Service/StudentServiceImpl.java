package com.naher_farhsa.TechM_Practice.Service;

import com.naher_farhsa.TechM_Practice.entity.Student;
import com.naher_farhsa.TechM_Practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    public int insertStudent(Student s) {
        repo.save(s);
        return 1;
    }

    public int updateStudent(Student s, String id) {
        if (repo.existsById(id)) {
            repo.save(s);
            return 1;
        }
        return 0;
    }

    public int deleteStudent(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return 1;
        }
        return 0;
    }

    public List<Student> fetchAll() {
        return repo.findAll();
    }

    public Student fetchOneStudent(String id) {
        return repo.findById(id).orElse(null);
    }
}

