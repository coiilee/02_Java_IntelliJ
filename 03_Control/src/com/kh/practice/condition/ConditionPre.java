package com.kh.practice;

import java.util.Scanner;

public class ConditionPre {
    public void methodAge() {
        Scanner scanner = new Scanner(System.in);

        // 나이 입력 받기
        System.out.print("나이를 입력 하세요.");
        int age = scanner.nextInt();

        //나이 분류
        switch (age/10) {
            case 0: case 1:
                System.out.println("어린이 입니다.");
                break;

            case 2:
                if(age <= 18) {
                    System.out.println("청소년 입니다.");
                } else {
                    System.out.println("어른 입니다.");
                }
                break;

            default:
                System.out.println("성인 입니다.");
                break;
        }
    }

}