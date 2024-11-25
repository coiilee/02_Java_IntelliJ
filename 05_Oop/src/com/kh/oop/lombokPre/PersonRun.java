package com.kh.oop.lombokPre;

public class PersonRun {
    //어노테이션으로 만든 게터세터 필수생성자 이요해 값 집어넣고 저장된 값 확인하기

    public static void main(String[] args) {
        //person1은 setter 를 이용해 부분적으로 값 넣고 출력
        Person person1 = new Person();
        person1.setName("John");

        //Getter로 저장되어있는 값을 System.out.println활용해 저장된 값 확인하기
        System.out.println(person1.getName());

        //person2sms allArgsConstructor를 이용해 모든 값 한번에 넣고 출력
        Person person2 = new Person();

    }
}
