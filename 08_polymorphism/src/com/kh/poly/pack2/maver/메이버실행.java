package com.kh.poly.pack2.maver;

public class 메이버실행 {
    public static void main(String[] args) {
        메이버블로그 blog1 = new 메이버블로그("이영희", "010-5885-8854","부산 해운대구","40","momo","여행블로그");
        System.out.println(blog1.toString());

        메이버카페 cafe1 = new 메이버카페("박철수","010-1122-3654","서울시 종로구","30","회원","요리카페");
        System.out.println(cafe1.toString());

//        메이버쇼핑 shopping1 = new 메이버쇼핑 ("한상섭","010-8596-9998","경기도 고양시","20","1000","vvip","108000");
//        System.out.println(shopping1.toString());
    }
}
