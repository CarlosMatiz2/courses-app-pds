package co.com.poli.courses.controller;

import co.com.poli.courses.persistance.entity.Instructor;
import co.com.poli.courses.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor){
        return instructorService.save(instructor);
    };

    @GetMapping
    public List<Instructor> findAll(){
        return instructorService.findAll();
    };

}
