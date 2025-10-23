package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

import java.util.*;

@RestController
public class StudentController {
	
    @Autowired
	StudentService ss;
	

    // GET /students
    @GetMapping("/students")
    public Collection<Student> getAllStudents() {
        return ss.getAllStudents();
    }

    // POST /students
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        return ss.addStudent(student);
    }

    // DELETE /students/{id}
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id) {
        return ss.deleteStudent(id);
    }
}
