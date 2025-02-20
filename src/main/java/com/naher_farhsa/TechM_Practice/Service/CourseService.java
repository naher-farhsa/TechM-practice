package com.naher_farhsa.TechM_Practice.Service;

import com.naher_farhsa.TechM_Practice.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public int insertCourse(Course s);
    public int updateCourse(Course s, String id);
    public int deleteCourse(String id);
    public List<Course> fetchAll();
    public Course fetchOneCourse(String id);
}
