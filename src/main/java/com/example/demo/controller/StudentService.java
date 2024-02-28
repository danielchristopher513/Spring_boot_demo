package com.example.demo.controller;
import  com.example.demo.studentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    List<Student> students = new ArrayList<>();
    @Autowired
    studentRepository studentRepository;

    public void createStudents() {

        students.add(new Student(1, "aaa", 1, 11));
        students.add(new Student(2, "bbb", 2, 22));
        students.add(new Student(3, "ccc",3, 33));
        students.add(new Student(4, "ddd", 4, 44));
    }
    public  List<Student> getStudents() {
        //createStudents();
        //return students;
        return studentRepository.findAll();
    }
    Student findStudent(int id){
        return  studentRepository.findById(id);
    }
    public  List<Student> getstudentbyname(String Name){
        return studentRepository.findByName(Name);
    }

    public  void  updatename(String name,int id){
        Student student = studentRepository.findById(id);
        student.setName(name);
        studentRepository.save(student);
        return;
    }
   public  void deleteemp(int id){
        Student student =studentRepository.findById(id);
        studentRepository.delete(student);
        return;
   }
    /**
     * add  a new student[row] in  the db
     * @param student
     */
    public void addStudent(Student student) {
        //students.add(student);
        studentRepository.save(student);
        System.out.println("added a student");
    }
}
