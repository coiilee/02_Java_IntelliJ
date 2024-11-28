package com.kh.pack1.practice;

import java.util.ArrayList;

public class StudentController {
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<>();

    public void StudentControl() {
        students.add(student);
        System.out.println("====학생 정보 출력=====");
        System.out.println(student);


    }
}
