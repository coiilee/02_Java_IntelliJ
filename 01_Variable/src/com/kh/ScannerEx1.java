package com.kh;

import java.util.Scanner;
public class ScannerEx1 {
    public static void main(String[] args) {
        /**Scanner 클래스
         *
         * -사용자로부터 입력을 받기 위해 Java 에서 제공하는 클래스
         *
         * -java.util 패키지에 존재
         * -> import 구문 작성 필요
         *
         * -Scanner.next() : 단어(String)1개 입력 공백 문자 입력시 입력 종료
         *
         * -Scanner.nextLine() : 문자열(String)1개 입력 엔터 (개행 문자) 입력 시 종료
         *
         * -Scanner.nextInt() : int 형 정수 1개 입력
         * -Scanner.nextLong() : long 형 정수 1개 입력
         * -Scanner.nextDouble() : 실수 1개 입력
         */

        //Scanner 사용하기
        //1. 클래스 위 import 하는 구문 작성

        //2. import 한 Scanner 클래스를 이용해서 Scanner 객체 생성

        //*System.in : (인텔리제이, 이클립스) 키보드

        Scanner sc = new Scanner(System.in);

        //console 창에서 어떤것을 입력해야 하는지 입력창표기를 위한 print 작성
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt(); //다음 입력된 정수를 얻어와 num1에 대입
        System.out.print("num1에서 가져온 정수는 : "+num1);
    }
}
