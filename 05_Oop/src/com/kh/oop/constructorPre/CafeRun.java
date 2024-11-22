package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    //1.main() 메서드 생성
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cafe cafe= new Cafe();
    System.out.println("주문하실 메뉴를 선택해주세요.");
    String name = sc.next();
    System.out.println("메뉴 가격을 작성해주세요.");
    int price = sc.nextInt();
    System.out.println("주문할 수량을 선택해주세요.");
    int quantity = sc.nextInt();


   Cafe c =  new Cafe(name,price,quantity);

   System.out.println(c.toString());
   System.out.println(c.result(c.getMenuPrice(), c.getMenuQuantity()));


    }
}
