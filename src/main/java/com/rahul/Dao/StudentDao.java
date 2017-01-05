package com.rahul.Dao;

import com.rahul.Entity.Student;

import java.util.Collection;

/**
 * Created by rahul on 5/1/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentDB(Student student);
}
