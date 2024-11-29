package com.kh.pack1.practice;

import java.util.ArrayList;

public class StudentController {
        private ArrayList<Student> students = new ArrayList<>();


        //5개의 객체배열을 위의 샘플 데이터의 값으로 초기화 해주는 기본 생성자
    public StudentController() {
        students.add(new Student("김길동", "자바", 100));
        students.add(new Student("박길동", "디비", 50));
        students.add(new Student("이길동", "화면", 85));
        students.add(new Student("정길동", "서버", 60));
        students.add(new Student("홍길동", "자바",20));
    }
        //객체 배열에 있는 모든 데이터 반환
    //void를 달면 조건을 달아줘야함.........
    public ArrayList<Student> printStudent() {
        return students;
    }

    //객체 배열의 점수를합한 값 리턴
    public int sumScore() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        return sum;
    }

    //double배열을 만들어 sumScore의 리턴 값을 0번째 인덱스에 저장하고 합의 평균을 1번째 인덱스에 저장 후 배열리턴
    public double[] avgScore() {
        double[] avgScore = new double[2];
        int result = sumScore();
        avgScore[0] = result;
        avgScore[1] = result/(double)students.size();
        return avgScore;
    }

    public void result() {
        int Cut_Line = 60;
        for (Student student : students) {
        if (student.getScore()<Cut_Line) {
            System.out.println(student.getName()+"는 불합격입니다.");
        } else {
            System.out.println(student.getName()+"는 합격입니다.");
        }
    }
    }





}
