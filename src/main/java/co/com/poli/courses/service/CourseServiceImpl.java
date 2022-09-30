package co.com.poli.courses.service;

import co.com.poli.courses.persistance.entity.Course;
import co.com.poli.courses.persistance.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository repository;

    @Override
    public Course save(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }
}
