package com.kh.practice;

import java.util.Scanner;

public class Practice1 {

    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요: ");

        int choice = sc.nextInt();
        String result = "";

        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                result = "잘못된 번호";
                break;
        }

        System.out.println(result + " 메뉴 입니다.");
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요.");
        int choice = sc.nextInt();

        if (choice == 0) {
            if (choice % 2 == 0) {
                System.out.println("짝수 입니다.");

            } else {
                System.out.println("홀수 입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다.");
        }
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String pw = sc.nextLine();

        if (id.equals("myId") && pw.equals("myPassword12")) {
            System.out.println("로그인 성공");

        } else if (!id.equals("myId")) {
            System.out.println("아이디가 틀렸습니다.");

        } else if (!pw.equals("myPassword12")) {
            System.out.println("비밀번호가 틀렸습니다.");

        }else {
            System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
        }

//            if (id == "myId" && pw == "myPassword12") {
//                System.out.println("로그인 성공");
//            } else if (id != "myId") {
//                System.out.println("아이디가 틀렸습니다.");
//            } else if (pw != "myPassword12") {
//                System.out.println("비밀번호가 틀렸습니다.");
//            } else {
//                System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
//            }
    }
}