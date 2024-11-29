package com.kh.pack1.practice;

import java.util.ArrayList;

public class StudentController_1 {
    private Student[]sArr = new Student[5];
    public static final int CUT_LINE = 60;

    public StudentController_1() {
        sArr[0] = new Student("김길동","자바",100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("박길동","디비",50);
        sArr[3] = new Student("박길동","디비",50);
        sArr[4] = new Student("박길동","디비",50);

    }
    //학생 정보 출력
     public Student[]printSTudent(){
        return sArr;
     }

}