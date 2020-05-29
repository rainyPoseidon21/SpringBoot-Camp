package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String department;

    public Student(final String id, final String name, final String department) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // default Constuctor JPA need this
    public Student() {

    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    
}