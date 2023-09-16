package com.example.studentmanagement;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Scope("prototype") //Giving new obj everytime its a one kind of scope
public class StudentRepository {
    Map<Integer,Student> db=  new HashMap<>();

    public Student getStudent(int regNo)
    {
        return db.get(regNo);
    }

    public void addStudent(Student student)
    {
        db.put(student.getRegNo(),student);
return;
    }

    public Student addUsingPathById(int regNo) {
       return db.get(regNo);
    }

    public Student updateStudent(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public Student updateStudentCourse(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }
}
