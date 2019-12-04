package com.example.myapplication.java;

public class Student<T> extends Person {
    int score;
    T salary;

    public Student(int score, T salary) {
        this.score = score;
        this.salary = salary;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }
}
