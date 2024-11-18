package com.kh;

import java.util.Scanner;
//줄바꿈 단축키 Alt + Shift + 화살표 위/아래
public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name 이름 입력 받고
        // int age로 나이 입력 받기
        // String hobby로 취미 입력 받기
        // 출력 : System.out.println




        System.out.println("======자기소개========");
        System.out.println("이름 : ");
        String name = sc.next(); //사용자가 키보드로 입력하는 이름을 입력받는 공간
        System.out.println("나이 : ");
        int age = sc.nextInt(); //사용자가 키보드로 입력하는 나이를 입력받는 공간
        System.out.println("취미 : ");
        String hobby = sc.next(); //사용자가 키보드로 입력하는 취미를 입력받는 공간
        System.out.println();

        System.out.println("======자기소개========");
        System.out.println("이름:"+name);
        System.out.println("나이:"+age+"세");
        System.out.println("취미:"+hobby);





    }
}
