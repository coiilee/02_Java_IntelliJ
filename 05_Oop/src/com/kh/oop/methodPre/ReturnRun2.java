package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 pre2 =new ReturnPre2();

        System.out.println("안녕하세요 제 이름은 "+pre2.name+"이고, 나이는 "+pre2.age+"세 입니다.");

       int num1 = 123;
       int num2 = 456;
        System.out.println(pre2.add(num1,num2)+"이 더 큰 숫자입니다.");


        System.out.println("입력한 점수 : ");
        pre2.xyz();
        System.out.println("등급: ");
        pre2.xyz();

    }
}
