package com.example.studentmanagement;

 class Student {
    private  int regNo;
     private String name;
    private String course;
     private int age;
    Student()
    {

    }
    Student(int regNo,String name, int age,String course)
    {
        this.regNo=regNo;
        this.name=name;
        this.age=age;
        this.course=course;
    }

     public int getRegNo() {
         return regNo;
     }

     public void setRegNo(int regNo) {
         this.regNo = regNo;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getCourse() {
         return course;
     }

     public void setCourse(String course) {
         this.course = course;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
