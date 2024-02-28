package com.example.demo.model;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
/**
 * This is pojo class
 * representing a student
 */
@Entity
@Table(name = "students")
public class Student {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String name;
    @Column
    int sem;
    @Column
    int avg;

    public Student() {}

    public Student(int id, String name, int sem, int avg) {
        super();
        this.id = id;
        this.name = name;
        this.sem = sem;
        this.avg = avg;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public int getAvg() {
        return avg;
    }
    public void setAvg(int avg) {
        this.avg = avg;
    }

}