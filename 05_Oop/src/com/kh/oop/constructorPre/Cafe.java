package com.kh.oop.constructorPre;

public class Cafe {
    private String menuName;
    private int menuPrice;
    private int menuQuantity;

    //기본생성자
    public Cafe() {
    }
    //필수생성자
    public Cafe(String menuName, int menuPrice, int menuQuantity) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuQuantity = menuQuantity;
    }
    //setter
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setMenuQuantity(int menuQuantity) {
        this.menuQuantity = menuQuantity;
    }

    //getter

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public int getMenuQuantity() {
        return menuQuantity;
    }

    //주문 총액 계산 price + quantity 전달

    public int result(int menuQuantity, int menuPrice) {

        return menuPrice * menuQuantity;
    }

    // 주문 출력 toString @Override 사용
    @Override
    public String toString() {
        return "Cafe{" +
                "menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", menuQuantity=" + menuQuantity +
                '}';
    }
}
