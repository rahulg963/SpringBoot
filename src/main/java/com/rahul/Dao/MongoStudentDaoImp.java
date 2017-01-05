package com.rahul.Dao;

import com.rahul.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rahul on 5/1/17.
 */

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImp implements StudentDao {
//  Create Mongo Connection
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"MONGO", "MongoLabs"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentDB(Student student) {

    }
}
