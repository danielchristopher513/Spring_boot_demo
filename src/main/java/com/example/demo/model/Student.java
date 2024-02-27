package com.example.demo.model;

/**
 * This is pojo class
 * representing a student
 */
public class Student {
    int id;
    String name;
    int sem;
    int avg;

    public Student(int id, String name, int sem, int avg) {
        this.id = id;
        this.name = name;
        this.sem = sem;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sem=" + sem +
                ", avg=" + avg +
                '}';
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
