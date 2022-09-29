package com.sai.loadfromproperties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

public class Student {

    @Value("${student.name}")
    private String name;


    @Value("${student.intrestedCourse}")
    private String intrestedCourse;


    @Value("${student.hobby}")
    private String hobby;

    @Value("${student.name}")
    @Required
    public void setName(String name) {
        this.name = name;
    }
//
//    public void setIntrestedCourse(String intrestedCourse) {
//        this.intrestedCourse = intrestedCourse;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }

    public void display(){
        System.out.println("Student Name "+name);
        System.out.println("Student Intersted course "+intrestedCourse);
        System.out.println("Student Hobby" +hobby);
    }
}
