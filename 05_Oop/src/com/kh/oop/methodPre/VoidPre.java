package com.kh.oop.methodPre;

import javax.swing.*;

public class VoidPre {
    //메서드1 : 온도 변화 확인하기
        //출력 : 섭씨 25도는 화씨 77.0도입니다.
    public void method1(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("섭씨"+celsius+"도는 화씨"+fahrenheit+"도 입니다.");
    }

    public void method2(String name){
        System.out.println("학생 이름 : "+name);
    }

    public void method3(String product,int price){
        System.out.println("상품명 : "+product+", 가격 : "+price+"원");
    }

    public void method4(int hours, int minutes) {
        int totalMinutes = hours * 60 + minutes;
        System.out.println("총 "+totalMinutes+"분 입니다.");
    }

    public void method5(String exercise , int duration ) {
        System.out.println("운동 : "+exercise +","+duration+"분");
    }

    //%s = String
    // %d = int
    // %.숫자f=소수점표기
    // %n =newLine(줄바꿈)
    public void method6(String accountNumber, double balance ) {
        System.out.printf("계좌번호 : %s, 잔액: %.2f원%n",accountNumber,balance);
    }

    public void method7(String movie, double rating) {
        System.out.println("영화 제목 : "+movie+","+"평점: " +rating+"/10");
    }

    public void method8(String carName, double topSpeed) {
    System.out.println("차량명: "+carName+", 최고속도 : "+topSpeed+"km/h");
    }

    public void method9(String email, String log){
        System.out.println("수신자 : "+email+", 제목: "+log);
    }

    public void method10(String productName, int quantity) {
        System.out.println("상품명"+productName+", 수량: "+quantity);
    }

}
