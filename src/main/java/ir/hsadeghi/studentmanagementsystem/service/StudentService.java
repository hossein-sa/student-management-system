package ir.hsadeghi.studentmanagementsystem.service;

import ir.hsadeghi.studentmanagementsystem.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Optional<Student> getStudentById(Long id);

    void updateStudent(Student student);

    void deleteStudentById(Long id);
}
