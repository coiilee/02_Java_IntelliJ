package com.kh.oop.constructorPre;

public class LottoRun {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        //로또번호 생성기능
        lotto.randomNumber();
        //로또번호 만들어지면 모든 번호 확인하기
        lotto.info();
    }
}
