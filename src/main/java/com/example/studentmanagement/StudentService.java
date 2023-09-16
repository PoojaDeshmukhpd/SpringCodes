package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {



    @Autowired
    StudentRepository sr;
    public Student getStudent(int regNo)
    {
        Student s=sr.getStudent(regNo);
        return s;
    }

    public String addStudent(Student student)
    {
        sr.addStudent(student);
        return "Student Added";
    }

    public Student addUsingPathById(int regNo) {
        return sr.addUsingPathById(regNo);
    }

    public Student updateStudent(int regNo, int newAge) {
        return sr.updateStudent(regNo,newAge);
    }

    public Student updateStudentCourse(int regNo, String course) {
        return sr.updateStudentCourse(regNo,course);
    }
}
