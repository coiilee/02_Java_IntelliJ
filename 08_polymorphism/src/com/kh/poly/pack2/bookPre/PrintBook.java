package com.kh.poly.pack2.bookPre;
//종이책만의 추가 필드 배송비(int shippingCost)를 가짐
public class PrintBook extends Book {

    private int shippingCost;

    public PrintBook() {

    }

    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.shippingCost = shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    @Override
    public String toString() {
        return super.toString() +
                "shippingCost=" + shippingCost +
                '}';
    }
}
