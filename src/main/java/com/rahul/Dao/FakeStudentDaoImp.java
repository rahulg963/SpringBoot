package com.rahul.Dao;

import com.rahul.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rahul on 5/1/17.
 */

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImp implements StudentDao {
    private static Map<Integer, Student> students ;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Rahul","CS"));
                put(2, new Student(2,"Sanyam","IT"));
                put(3, new Student(3,"Ritish","ECE"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }


    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentDB(Student student) {
        this.students.put(student.getId(), student);
    }
}
