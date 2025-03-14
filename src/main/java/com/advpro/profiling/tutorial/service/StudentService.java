package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Optimized StudentService for better performance in Apache JMeter tests.
 * - Reduces database calls
 * - Uses Streams for efficient operations
 * - Improves string concatenation performance
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()) {
            return Collections.emptyList();
        }

        // Get all courses in one go instead of calling findByStudentId multiple times
        List<StudentCourse> studentCourses = studentCourseRepository.findAll();
        Map<Long, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));

        return studentCourses.stream()
                .map(sc -> {
                    StudentCourse newSc = new StudentCourse();
                    newSc.setStudent(studentMap.get(sc.getStudent().getId()));
                    newSc.setCourse(sc.getCourse());
                    return newSc;
                })
                .collect(Collectors.toList());
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll().stream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    public String joinStudentNames() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}