package com.kh.oop.oopEx;

public class BreadRun {
    public static void main(String[] args) {
        Bread b1 = new Bread();
        b1.setBreadName("소금빵");
        //b1에 들어가는 값는 소금빵이지만
        //b2에 들어가는 값은 초코소라빵 1500원 2개가 모두 작성되어야 하는 것
        Bread b2 = new Bread("초코소라빵",1500,2);

        System.out.println(b1.getBreadName());
        System.out.println("b2와 b1값이 어떻게 설정되어있는지 확이하기");
        System.out.println(b2.toString());
    }
}