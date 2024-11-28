package com.kh.Collection.pack3.mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {
    //method1은 기본으로 put에 직접적으로 작성하고 작성된 내용
    public void method1() {
    HashMap<String,Integer> menu = new HashMap<String, Integer>();

    menu.put("이탈리안 비엠티 " , 6200);
    menu.put("치킨 데리야끼 " , 6500);

    //메뉴 출력 함수 호출
        System.out.println("subway 메뉴에 따른 가격 목록 : "+ menu);

}

    //method2는 스캐너로 입력받고 입력받은 내용 출력하기
    public void method2() {
        //1.HashMap 생성 (샌드위치 이름, 가격 저장하는 목록인 menu 변수명 생성 )
        HashMap<String,Integer> menu = new HashMap<String, Integer>(); //저장된 메뉴이름 가격 목록 저장하는 공간

        //2. Scanner로 입력받기 위해 입력하는 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("추가하고자 하는 샌드위치 이름 : ");
        String menuName =sc.nextLine();
        System.out.println("샌드위치 이름에 대한 가격 : ");
        int menuPrice =sc.nextInt();
        sc.nextLine();

        //스캐너로 입력받은 메뉴 이름과 가격 변수로 해시멥 안에 담기
        menu.put(menuName,menuPrice);
//
//        menu.put("이탈리안 비엠티 " , 6200);
//        menu.put("치킨 데리야끼 " , 6500);

        //메뉴 출력 함수 호출
        System.out.println("subway 메뉴에 따른 가격 목록 : "+ menu);

    }
}
