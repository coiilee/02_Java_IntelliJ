package com.kh.oop.methodPre;

public class StudentRun {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("홍길동");
        s.setAge(17);
        s.setGender("남성");
        s.setMajor("컴퓨터공학");

        System.out.println(s); //위치 주소
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getMajor());

    }
}
