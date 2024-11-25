package com.kh.oop.oopEx;

public class Bread {

    //필드 인스턴스 변수 속성 전역변수
    private String breadName; //빵이름
    private int breadPrice; //빵가격
    private int quantity; //빵수량

    //메서드(=기능) 기본, 매개변수 Setter Getter ToString

    //1. Setter 생성
    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //2. Getter 생성
    public String getBreadName() {
        return breadName;
    }

    public int getBreadPrice() {
        return breadPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    //3. 기본 생성자
    public Bread() {
    }
    //필드에 작성한 변수명에 모든 값을 넣어야할 경우에 4번 필수생성자를 이용해 넣지만
    //부분적으로 필드에 작성한 변수명에 값을 넣어야할 경우 set을 이용해 값을 저장.
    //4. 필수 생성자 = AllArgs 모든 필드명에 값을 넣어줌
    public Bread(String breadName, int breadPrice, int quantity) {
        this.breadName = breadName;
        this.breadPrice = breadPrice;
        this.quantity = quantity;
    }

    //5. toString

    @Override
    public String toString() {
        return "BreadRun{" +
                "breadName='" + breadName + '\'' +
                ", breadPrice=" + breadPrice +
                ", quantity=" + quantity +
                '}';
    }
}
