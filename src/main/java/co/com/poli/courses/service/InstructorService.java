package co.com.poli.courses.service;

import co.com.poli.courses.persistance.entity.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);
    List<Instructor> findAll();
}
