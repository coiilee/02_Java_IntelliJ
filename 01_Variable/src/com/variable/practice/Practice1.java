package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char 문자 = sc.next().charAt(0);

        int unicode = (int)문자;
        //붙이지 않아도 에러가 나지 않을 수 있지만, 서로 다른 타입에서 이동하는 것이기 때문에
        //문자 -> 숫자 강제형변환 표기

        System.out.println("A unicode : "+unicode);

        //스캔이 모두 종료되면 닫아주기
        sc.close();//스캐너를 모두 사용하면 닫아주는 것이 좋음

        //Run 단축키 -> ctrl + shift + F10

    }
}


