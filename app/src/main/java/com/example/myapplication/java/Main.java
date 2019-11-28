package com.example.myapplication.java;

import com.example.myapplication.kotlin.KotlinfileKt;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new Integer(123));
        String first = list.get(0).toString();
        System.out.println("这是我在dev1新增的修改！");
        System.out.println("开发完了，把该分支合到主分支");

    }
}

