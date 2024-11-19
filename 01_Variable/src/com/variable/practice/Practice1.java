package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char 문자 = sc.next().charAt(0);

        System.out.println("A unicode : "+(int)문자);


    }
}


