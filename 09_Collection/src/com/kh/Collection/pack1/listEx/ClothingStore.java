package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
   private ArrayList<Clothing>clothing1 = new ArrayList<Clothing>();
        Scanner scanner = new Scanner(System.in);

    //옷 추가 기능
    public void addClothing(){
        System.out.print("옷 이름 : ");
        String name = scanner.nextLine();

        System.out.print("카테고리(상의/하의/외투 등) : ");
        String category= scanner.nextLine();

        System.out.print("가격 : ");
        String price = scanner.nextLine();

        scanner.close();

        Clothing clothing = new Clothing(name,category,price);
        clothing1.add(clothing); //추가된 옷 이름 카테고리 가격을 리스트에 저장

        System.out.println("["+name+"]추가완료");


    }

    //추가된 옷 리스트 확인하는 기능
    public void allClothing(){
//만약 등록된 옷 목록이 존재하지 않는다면
        System.out.println("===옷 목록 출력하기===");
        if (clothing1.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        }else {
           System.out.println(clothing1);
        }
       for (Clothing clothing : clothing1) {
           System.out.println(clothing);
       }


    }




}
