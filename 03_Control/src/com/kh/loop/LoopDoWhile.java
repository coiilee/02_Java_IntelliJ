package com.kh.loop;

import java.util.Scanner;

public class LoopDoWhile {
            Scanner sc = new Scanner(System.in);
    /**
     * do-while 문
     * -조건식이 뒤에 작성된 while 문
     * -무조건 최소 1회 이상의 반복을 보장
     */

    /**
     * 기능(=method)
     * method1()기능은
     * do-while문을 이용해서 0이 입력될 때까지 정수를 계속 입력 받고,
     * 0 입력시 누적된 합계 출력해줌
     * */

    public void method1() {
        int sum = 0; //합계 누적용 변수
        int input = 0; //입력한 값을 저장하는 변수

        do { //while문을 시작하기 전에 한번 무조건 실행하는 공간.
                // 입력한 값이 0이 아닐 때 반복.
            System.out.println("정수입력: ");
            input = sc.nextInt(); //사용자가 키보드로 입력한 정수 가져오기
            sum += input; //입력한 수를 sum 변수에 계속 더하기를 진행하는 부분
                            //sum으로 누적된 값이 얼마이던 간에 input으로 들어온 값이 0이면 종료

        }while (input != 0); // input의 값이 0이 아닐때, do {}에서 적어놓은 기능을 계속 수행한다는 의미.
        System.out.println("합계 : "+sum);
    }

}
