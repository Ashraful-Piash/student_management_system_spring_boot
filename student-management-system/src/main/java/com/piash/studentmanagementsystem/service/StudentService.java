package com.piash.studentmanagementsystem.service;

import com.piash.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

}
