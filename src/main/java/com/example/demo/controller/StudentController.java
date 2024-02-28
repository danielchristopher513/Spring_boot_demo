package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();

    }
    @RequestMapping(method = RequestMethod.POST, value ="students")
    public void addStudent(@RequestBody Student student) {
        System.out.println("controllers add student");
        studentService.addStudent(student);
    }

    @RequestMapping("/students/name={Name}")
    public List<Student> getname(@PathVariable String Name){
        return  studentService.getstudentbyname(Name);
    }

    @RequestMapping("/students/update_name={new_nm}/id={id}")
    public  void update_name(@PathVariable  String new_nm,@PathVariable int id){
         studentService.updatename(new_nm,id);
    }

    @RequestMapping("/students/{id}")
    public Student findStudent(@PathVariable int id){//in url path there's a variable

        return studentService.findStudent(id);

    }
    @RequestMapping("/students/delete/{id}")
    public  void delete(@PathVariable int id){
        studentService.deleteemp(id);
        return;
    }


}
