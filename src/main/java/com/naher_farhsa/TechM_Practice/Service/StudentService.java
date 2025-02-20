package com.naher_farhsa.TechM_Practice.Service;

import com.naher_farhsa.TechM_Practice.entity.Student;

import java.util.List;

public interface StudentService{

    public int insertStudent(Student s);
    public int updateStudent(Student s, String id);
    public int deleteStudent(String s);
    public List<Student> fetchAll();
    public Student fetchOneStudent(String s);

}
