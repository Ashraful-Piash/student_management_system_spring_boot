package com.piash.studentmanagementsystem.service.impl;

import com.piash.studentmanagementsystem.entity.Student;
import com.piash.studentmanagementsystem.repository.StudentRepository;
import com.piash.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleStudent(Student student) {
        return null;
    }
}
