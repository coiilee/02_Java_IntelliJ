package com.variable.practice;

public class Practice3 {
    public static void main(String[] args) {
    int num1 = 10;
    int num2 = 4;
    float fNum = 3.0f;
    double dNum = 2.5;
    char ch = 'A';

    System.out.println(num1/num2);
    System.out.println((int)dNum); //2

    System.out.println(num2*dNum); //10.0
    System.out.println((float)num1); //10.0

    System.out.println(num1/(float)num2); //2.5
    System.out.println(dNum); //2.5

    System.out.println((int)fNum); //3
    System.out.println(num1/(int)fNum); //3

    System.out.println((float)num1/fNum); //3.3333333
    System.out.println((double)num1/fNum); //3.3333333333335


    System.out.println(ch); //'A'
    System.out.println((int)ch); //65
    System.out.println(ch+num1); //75 (문자와 정수의 덧셈, 유니코드 값으로 계산됨 )
    System.out.println((char)(ch+num1)); //'K'
    }
}
