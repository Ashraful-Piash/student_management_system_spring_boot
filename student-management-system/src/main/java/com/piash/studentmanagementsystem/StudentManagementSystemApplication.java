package com.piash.studentmanagementsystem;

import com.piash.studentmanagementsystem.entity.Student;
import com.piash.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ashraful", "Haque","ashrafulpiash15@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Ashraful", "Piash","ashraful@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Mashrafe", "Mortaza","mortazq@gmail.com");
		studentRepository.save(student3);
		Student student4 = new Student("Shakib", "Hasan","sakibhasan@gmail.com");
		studentRepository.save(student4);
		Student student5 = new Student("Liton", "Nitol","liton@gmail.com");
		studentRepository.save(student5);

	}
}
