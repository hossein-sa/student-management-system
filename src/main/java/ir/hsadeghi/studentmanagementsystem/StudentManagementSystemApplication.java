package ir.hsadeghi.studentmanagementsystem;

import ir.hsadeghi.studentmanagementsystem.entity.Student;
import ir.hsadeghi.studentmanagementsystem.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentManagementSystemApplication implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("tony", "stark", "tony@gmail.com");
//        studentRepository.save(student3);
    }
}
