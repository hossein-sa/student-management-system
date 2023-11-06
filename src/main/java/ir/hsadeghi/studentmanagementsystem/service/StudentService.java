package ir.hsadeghi.studentmanagementsystem.service;

import ir.hsadeghi.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);
}
