package com.example.demo.services;

import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    private final Map<String, Student> studentDatabase = new HashMap<>();

    public StudentService() {
        Student hardcodedStudent = new Student("G00000001", "Alice", 22);
        studentDatabase.put(hardcodedStudent.getId(), hardcodedStudent);
    }

    public Collection<Student> getAllStudents() {
        return studentDatabase.values();
    }

    public String addStudent(Student student) {
        studentDatabase.put(student.getId(), student);
        return "Student added successfully.";
    }

    public String deleteStudent(String id) {
        if (studentDatabase.containsKey(id)) {
            studentDatabase.remove(id);
            return "Student deleted successfully.";
        } else {
            return "Student not found.";
        }
    }
}
