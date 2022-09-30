package co.com.poli.courses.controller;

import co.com.poli.courses.persistance.entity.Course;
import co.com.poli.courses.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }

}
