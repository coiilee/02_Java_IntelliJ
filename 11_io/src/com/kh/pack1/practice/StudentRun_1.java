package com.kh.pack1.practice;

public class StudentRun_1 {
    public static void main(String[] args) {
      StudentController Controller = new StudentController();

        System.out.println("=====학생 정보 출력=====");
        for( Student student : Controller.printStudent()){
            System.out.println(student);
        }
        System.out.println("=====학생 성적 출력=====");
        double[]studentScores = Controller.avgScore();
        System.out.println("학생 점수 합계 : " + studentScores[0]);
        System.out.println("학생 점수 평균 : " + studentScores[1]);
        System.out.println("=====성적 결과 출력=====");
        Controller.result();



    }
}
