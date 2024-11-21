package com.kh.oop.methodPre;

public class ReturnPre1 {

    //가상의 사용자 데이터 작성
    //이름, 핸드폰번호, 아이디
    public String name = "홍길동";
    public int phone = 1234;
    public String Id = "dongdong1004";

    //이름과 핸드폰 번호가 일치하는 아이디를 전달하기
    public String findId(String a, int b){

        //만약 이름과 핸드폰번호가 일치한 고객이라면 아이디를 전달
        if(name.equals(a) && phone == b){ //String은 참조형이기 때문에 equals 사용
       return Id;
        }


//        if(phone == b){ //기본타입은 ==사용
//                return Id;
//        }


        //일치하지 않는 고객이라면 조회된 정보가 없습니다 전달하기
        return "아이디를 찾을 수 없습니다.";
    }


    //계산기
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
}
