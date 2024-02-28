package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface studentRepository extends JpaRepository<Student,Long> {
    Student findById(int id);

    List<Student> findByName(String name);


}
