package com.variable.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double 국어= sc.nextDouble();
        System.out.print("영어 : ");
        double 영어= sc.nextDouble();
        System.out.print("수학 : ");
        double 수학= sc.nextDouble();

        System.out.println("총점 : " +(int)(국어+영어+수학));
        System.out.println("평균 : " +(int)(국어+영어+수학)/3);

    }
}


