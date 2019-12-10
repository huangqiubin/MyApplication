package com.example.myapplication.java;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        Person person = new Student(1,"12");
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(2,"23"));
//        students.add(new Student(3,"32"));
//        students.add(new Student(4,"56"));
//        List<? extends Person> list = students;
//        System.out.println(((Student)list.get(1)).score);
//        List<? super Student> list1 = new ArrayList<>();
//        list1.add(new Student(1,"2"));


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        for (int i = list.size() - 1; i >= 0; i--) {
//            if (list.get(i) == 1){
//                list.remove(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == 1) {
//                list.remove(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        int days = differentDays(new Date(1575959355000l),new Date(System.currentTimeMillis()));
        System.out.println(days);
    }

    public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2-day1) ;
        }
        else    //不同年
        {
            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }

}

