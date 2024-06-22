package com.Robert.StudentApp.controller;

import com.Robert.StudentApp.model.Student;
import com.Robert.StudentApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping()
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{Id}")
    public Student getStudentById(@PathVariable String Id){
        Optional<Student> student= studentRepository.findById(Id);
        return student.orElse(null);
    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PutMapping("/{Id}")
    public Student updateStudent(@PathVariable String Id, @RequestBody Student student){
        student.setId(Id);
        return studentRepository.save(student);
    }

    @DeleteMapping("/{Id}")
    public void deleteStudent(@PathVariable String Id){
        studentRepository.deleteById(Id);
    }
}
