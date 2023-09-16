package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //this class is containing api
public class StudentController {
//    Map<Integer,Student> db= new HashMap<>();
    @Autowired
    StudentService ss;
    @GetMapping("/get")
public Student getStudent(@RequestParam("regNo") int regNo)
{
    return ss.getStudent(regNo);
}

@PostMapping("/add")
public String addStudent(@RequestBody Student student)
{
    ss.addStudent(student);
    return "Student addes Successfully";
}

@GetMapping("/getUsingPath/{id}")
public ResponseEntity addUsingPathById(@PathVariable(" ") int regNo)
{
    Student s=ss.addUsingPathById(regNo);
    if(s==null)
    {
        return new ResponseEntity<>("Student Not Found", HttpStatus.NOT_FOUND);
    }
    else{
        return new ResponseEntity(s,HttpStatus.FOUND);
    }
}

@PutMapping("/update/{id}")
public Student updateStudent(@PathVariable("id") int regNo,@RequestParam("age") int newAge)
{

    return ss.updateStudent(regNo,newAge);
}

@PutMapping("/updateStudentCourse/{course}/{regNo}")
public Student updateStudentCourse(@PathVariable("regNo") int regNo,@PathVariable("course") String course)
{

    return ss.updateStudentCourse(regNo,course);
}
}
