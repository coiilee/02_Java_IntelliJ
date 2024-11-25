package com.kh.oop.oopEx;
//회원가입을 하는데
//이름 연락처 주민번호 필수로 받음
//취미 특기는 필수가 아님 선택사항

public class People {


    //필드
    private String name;
    private int jumin;
    private int phone;
    private String hobby;
    private String specialty;

    //메서드

    //기본생성자
    public People() {
    }

    //부분적으로 필수 생성자
    public People(String name, int jumin, int phone) {
        this.name = name;
        this.jumin = jumin;
        this.phone = phone;
    }

    //세터
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    //게터
    public String getHobby() {
        return hobby;
    }

    public String getSpecialty() {
        return specialty;
    }


    //toString
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", jumin=" + jumin +
                ", phone=" + phone +
                ", hobby='" + hobby + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
