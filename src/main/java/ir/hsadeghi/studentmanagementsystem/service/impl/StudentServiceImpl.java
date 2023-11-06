package ir.hsadeghi.studentmanagementsystem.service.impl;

import ir.hsadeghi.studentmanagementsystem.entity.Student;
import ir.hsadeghi.studentmanagementsystem.repository.StudentRepository;
import ir.hsadeghi.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
