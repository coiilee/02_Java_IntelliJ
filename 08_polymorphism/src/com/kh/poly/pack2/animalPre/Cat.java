package com.kh.poly.pack2.animalPre;

public class Cat extends Animal {
    private String 품종;
    private String 펀치횟수;

    public Cat(String 품종, String 펀치횟수) {
        this.품종 = 품종;
        this.펀치횟수 = 펀치횟수;
    }

    public Cat(int age, String name, String 품종, String 펀치횟수) {
        super(age, name);
        this.품종 = 품종;
        this.펀치횟수 = 펀치횟수;
    }
}
