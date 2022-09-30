package co.com.poli.courses.service;

import co.com.poli.courses.persistance.entity.Instructor;
import co.com.poli.courses.persistance.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService{

    private final InstructorRepository repository;

    @Override
    public Instructor save(Instructor instructor) {
        return repository.save(instructor);
    }

    @Override
    public List<Instructor> findAll() {
        return repository.findAll();
    }
}
