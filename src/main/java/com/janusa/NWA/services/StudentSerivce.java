package com.janusa.NWA.services;


import com.janusa.NWA.models.StudentModel;
import com.janusa.NWA.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentSerivce
{
    @Autowired
    IStudentRepository studentRepository;

    public ArrayList<StudentModel> getStudent(){
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }

    public StudentModel saveStudent(StudentModel student){
        return studentRepository.save(student);
    }

    public Optional<StudentModel> getById(Long id){
        return studentRepository.findById(id);
    }

    public StudentModel uptdateById(StudentModel request, Long id){
        StudentModel student= studentRepository.findById(id).get();

        student.setAlumn_DNI(request.getAlumn_DNI());
        student.setNombre(request.getNombre());
        student.setApellido(request.getApellido());
        student.setFecha_nac(request.getFecha_nac());

        return student;
    }


}
