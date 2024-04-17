package com.janusa.NWA.controllers;


import com.janusa.NWA.models.StudentModel;
import com.janusa.NWA.services.StudentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentSerivce studentSerivce;

    @GetMapping
    public ArrayList<StudentModel> getStudents(){
        return this.studentSerivce.getStudent();
    }

    @PostMapping()
    public StudentModel saveStudent(@RequestBody StudentModel student){
        return this.studentSerivce.saveStudent(student);
    }

    @GetMapping(path="/{id}")
    public Optional<StudentModel> getStudentById(@PathVariable Long id){
        return this.studentSerivce.getById(id);
    }





}
