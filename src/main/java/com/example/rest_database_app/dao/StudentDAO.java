package com.example.rest_database_app.dao;

import com.example.rest_database_app.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
