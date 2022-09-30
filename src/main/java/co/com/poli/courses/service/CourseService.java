package co.com.poli.courses.service;

import co.com.poli.courses.persistance.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    List<Course> findAll();

}
