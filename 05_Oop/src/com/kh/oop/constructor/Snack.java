package com.kh.oop.constructor;

public class Snack {
    /*
     * SnackRun 에
     * 1. 기본생성자
     * 초코칩 쿠키 1500원 달콤한 초코맛
     * 허니버터칩 2000원 달콤 버터맛
     *
     * 2. 매개변수 ALL 생성자
     * 새우깡 1200 짭짤할 새우맛
     *
     *
     * 과자정보 toString 출력
     * */
    //1. 필드
    private String snackName;
    private int snackPrice;
    private String snackDescription;


    //2.메서드
    //2-1 기본생성자
    public Snack() {
    }

    //2-2 매개변수 ALL 생성자
    public Snack(String snackName, int snackPrice, String snackDescription) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackDescription = snackDescription;
    }
    //2-3 Setter
    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public void setSnackDescription(String snackDescription) {
        this.snackDescription = snackDescription;
    }
    //2-4 Getter
    public String getSnackName() {
        return snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public String getSnackDescription() {
        return snackDescription;
    }

    //2-5 to String

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", snackPrice=" + snackPrice +
                ", snackDescription='" + snackDescription + '\'' +
                '}';
    }
}

