package com.kh.oop.oopEx;

public class PeopleRun {
    public static void main(String[] args) {
        //이름 주민번호 연락처
        People p = new People("홍길동",800101,23467890);
        System.out.println(p.toString());
        People p2 = new People("강길자",903990,89996554);

        //필수로 저장해야되는 값은 아니지만 추가적으로 db에 넣고자 하는 값 구분
        p2.setHobby("음악듣기");
        p2.setSpecialty("코딩");
        System.out.println(p2.toString());

    }
}
