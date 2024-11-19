package com.variable.practice;

import java.util.Scanner;

//자동정렬 단축키 : ctrl + alt + L 
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double 국어 = sc.nextDouble();
        System.out.print("영어 : ");
        double 영어 = sc.nextDouble();
        System.out.print("수학 : ");
        double 수학 = sc.nextDouble();

        int 총점 =(int)(국어+영어+수학); // 국영수 점수 더한 다음 강제형변환 진행 
        int 평균 = 총점/3;
        System.out.println("총점 : " + 총점);
        System.out.println("평균 : " + 평균);

    }
}


