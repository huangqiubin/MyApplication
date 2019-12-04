package com.example.myapplication.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Person person = new Student(1,"12");
        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"23"));
        students.add(new Student(3,"32"));
        students.add(new Student(4,"56"));
        List<? extends Person> list = students;
        System.out.println(((Student)list.get(1)).score);
        List<? super Student> list1 = new ArrayList<>();
        list1.add(new Student(1,"2"));

    }

}

