package com.kh;
/**
 * import java.util.scanner; 
 * import = 외부 폴더나 내부 폴더에서 특정 파일을 가져오기 
 * import 폴더명1.폴더명2.파일명;
 * 다른 파일에서 특정 파일을 가져와 사용할 때는 
 * 파일명 맨 앞글자가 영어로 대문자인지 확인하기 
 * 파일이름을 소문자로 모두 작성한 경우 외부에서 파일 가져오기 x 
 * 
 * 자바 자체에서 만든 파일이름과 똑같은 파일이름 만들기 금지 ! 
 */


import java.util.Scanner;

public class ScannerPre1 {
    public static void main(String[] args) {
        //외부에서 가져온 파일명 작성 
        //자료형 변수명 = 새로운  스캐너시작(프로그램 내에서 작성한 값 읽기모드);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number1 :");
        int num1 = sc.nextInt(); //정수 1번 입력
        /**
         * 매번 new Scanner(System.in)을 작성하기 번거롭기 때문에
         * 맨 위에 sc라는 변수명으로 스캐너에서 사용자가 키보드로 입력한 값을
         * 시스템 안에다가 스캔해서 전달한다는 기능을 sc라는 이름으로 줄여서 사용한다 한 것.
         *
         * int의 경우 nextInt
         * double의 경우 nextDouble
         * float의 경우 nextFloat
         * 하지만 String의 경우 byte가 몇 byte인지 측정할 수 없기 때문에
         * next()만 작성.
         * */
        System.out.println("Enter a number2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3 :");
        double num3 = sc.nextDouble(); //실수값으로 입력받기
        System.out.println("이름 입력하기 :");
        String name = sc.next();

        System.out.println("num1: " + num1 + "num2: " + num2 + "num3: " + num3 + "name: " + name);
               
        //자동으로 정렬하는 단축키 Ctrl + Alt + L
    }
}
