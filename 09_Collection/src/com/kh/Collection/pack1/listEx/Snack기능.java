package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {

    public void addSnack() {
        Scanner sc = new Scanner(System.in);
        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("과자 가격 입력 : ");
        int price = sc.nextInt();

        System.out.print("재고 수량 : ");
        int quantity = sc.nextInt();

        sc.nextLine();
        sc.close(); //스캐너 종료

        //과자정보를 저장하는 저장클래스 소환
        Snack snack1 = new Snack(name, price, quantity); //Scanner 로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack2 = new Snack("오맛나과자",5000,3); //Scanner 로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack3 = new Snack("양파맛나과자",8000,5); //Scanner 로 입력받은 과자명, 가격, 수량이 들어감

        //과자정보를 목록으로 저장하는 배열 리스트 소환하기
        ArrayList<Snack>snacks = new ArrayList<Snack>();
        snacks.add(snack1);//과자목록들에 새로 입력받은 과자 한개에 대한 정보를 저장
        snacks.add(snack2);//과자목록들에 새로 입력받은 과자 한개에 대한 정보를 저장
        snacks.add(snack3);//과자목록들에 새로 입력받은 과자 한개에 대한 정보를 저장
       // System.out.println(snacks.toString());

        System.out.println("*****과자목록 출력******");
        for (int i = 0; i < snacks.size(); i++) { //index= length() -1 index = size -1
            snacks.get(i);
            System.out.println(snacks.get(i));
        }



        // 모두 출력을 하되, 아래처럼 한 줄씩 출력되길 원할 때
        //준비물: size() length대신해 size()를 이용해 몇개 들어있는지 확인
        //향상된 for문을 이용해 모두 출력해주기 or for문을 이용해서 출력해줄 수 있음
        //0번 :snackName='오리지널 맛나과자 ', snackPrice=10000, snackQuantity=10,
        //1번 :  snackName='오맛나과자', snackPrice=5000, snackQuantity=3,
        //2번 :  snackName='양파맛나과자', snackPrice=8000, snackQuantity=5]
        //
        //종료 코드 0(으)로 완료된 프로세스
    }
}
