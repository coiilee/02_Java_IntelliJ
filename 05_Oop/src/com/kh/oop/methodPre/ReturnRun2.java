package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 pre2 =new ReturnPre2();

        String result = pre2.introduce("홍길동",40);
        System.out.println(result);


       int num1 = 123;
       int num2 = 456;
        System.out.println(pre2.add(num1,num2)+"이 더 큰 숫자입니다.");

        System.out.print(pre2.xyz(+85));


}
