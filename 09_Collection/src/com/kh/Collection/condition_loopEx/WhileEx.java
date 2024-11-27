package com.kh.Collection.condition_loopEx;

public class WhileEx {
    int abcd = 1;
    boolean isTrue = true;
    public static void main(String[] args) {
        WhileEx ex = new WhileEx();
        ex.method1(); //switch로 작성된 while기능 실행
        ex.method2(); //if로 작성된 while기능 실행
    }
        public void method1() {
            while (isTrue) {
                switch (abcd) {
                    case 1:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("숫자를 잘못 입력했습니다. 프로그램을 종료합니다.");
                        isTrue = false;
                }
            }
        }


        public void method2() {
        while(true){
            int a = 1;
            switch(a) {
                case 1:
                    System.out.println("1");
                    break;
                default:
                        System.out.println("숫자를 잘못 입력했습니다. 프로그램을 종료합니다.");
                        return;
            }
        }
        }
    }
    /*
    while은 조건이 참(true)인 동안 특정 코드 블록을 반복적으로 실행하는 제어 구문

    while(조건이true일 때) {
    반복 실행될 코드
    }
    반복 횟수가 명확하지 않을 때 사용함.
    while(false)라면 내부 코드는 한번도 실행되지 않기 때문에 문제가 발생함.
    while(true)로 반드시 설정해야함.

    while문을 종료하는 방법은 ()안을 false로 만들거나 , return 처리를 하는 방법이 있음.
    1. while문을 false로 만들기
    boolean isTrue= true
    while(isTrue) {
            if(조건1) {
             //조건1이 실행되는 코드
             } else {
             조건 1이 아닐때 실행되는 코드
             isTrue = false로 변경해서 while문을 종료시킴
             }
    }

    2. return 처리
    while(true){

        if(조건1) {
        //조건1이 true일 때 실행되는 코드
        } else {
            //조건1이 아닐 때 실행되는 코드
            return; 사용해서 위 모든 기능 while 포함해서 종료시키기
         }

    * */




