package ir.hsadeghi.studentmanagementsystem.service.impl;

import ir.hsadeghi.studentmanagementsystem.entity.Student;
import ir.hsadeghi.studentmanagementsystem.repository.StudentRepository;
import ir.hsadeghi.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
