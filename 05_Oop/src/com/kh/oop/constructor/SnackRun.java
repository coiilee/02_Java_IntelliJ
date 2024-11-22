package com.kh.oop.constructor;

public class SnackRun {

    public static void main(String[] args) {
        Snack snack1 = new Snack();
        snack1.setSnackName("초코칩쿠키");
        snack1.setSnackPrice(1500);
        snack1.setSnackDescription("달콤한 초코맛");
        Snack snack2 = new Snack();
        snack2.setSnackName("허니버터칩");
        snack2.setSnackPrice(2000);
        snack2.setSnackDescription("달콤한 버터맛");

    Snack snack3 = new Snack("새우깡",1200,"짭잘한 새우맛");
    System.out.println(snack3);

    System.out.println(snack1.toString());
    System.out.println(snack2.toString());
    System.out.println(snack3.toString());

    System.out.println("초코칩 쿠키 정보 : "+ snack1.getSnackDescription());
    System.out.println("허니버터칩 정보 : "+ snack2.getSnackDescription());
    System.out.println("새우깡 정보 : "+ snack3.getSnackDescription());

    }

}
