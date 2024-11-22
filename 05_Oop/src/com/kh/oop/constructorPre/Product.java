package com.kh.oop.constructorPre;
//03_0 필드 실습 예제 1번
public class Product {
    //필드
    //-pName price band
    private String pName="제품명";
    private int pPrice=1500;
    private String brand="가나다라 맑은세상";

    //메서드 기능들 ↓
    //기본생성자
    //+Product()
    public Product() {
    }

    //void 메서드
    //+information() : void
    public void information(){
        System.out.println("이름 : "+pName);
        System.out.println("가격 : "+pPrice);
        System.out.println("브랜드 : "+brand);

    }


}
