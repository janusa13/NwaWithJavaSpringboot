package com.janusa.NWA.repositories;

import com.janusa.NWA.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentModel, Long> {
}
