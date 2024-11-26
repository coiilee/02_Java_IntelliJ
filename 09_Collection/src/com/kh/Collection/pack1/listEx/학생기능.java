package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {

    //학생을 추가하는 addStudent(){} 기능 설정
   public void addStudent(){
       Scanner sc = new Scanner(System.in);
       System.out.print("학생 이름을 입력하세요 :");
       String name = sc.nextLine();

       System.out.print("학생 학년을 입력하세요: ");
       int age = sc.nextInt();

       System.out.print("학생 취미를 입력하세요 : ");
       String hobby = sc.nextLine();
       //<학생> 타입으로 ArrayList 생성 변수명 std1

       //s1은 단순히 등록만 하는 것
       학생 s1 = new 학생(name,age,hobby);
       학생 s2 = new 학생("홍길동",10,"공부하기");
       학생 s3 = new 학생("박철수",20,"친구만나기");

       /*
       * 메모리 위치에 퍼져 있는 s1, s2,s3를 index 0번부터 정렬시키기 위해 std1 배열을 설정한 것이고,
       * std1로 인해 퍼져있는 s1, s2, s3 를 정렬 시킬 수 있는 것.
       * */


       //std1는 등록된 학생들의 목록표를 만들기 위해 설정한 공간
       ArrayList<학생> std1 = new ArrayList<학생>();
      std1.add(s1);
      std1.add(s2);
      std1.add(s3);

      //std1에 저장되어있는 s1,s2,s3 학생들을 모두 for문을 이용해 출력해주기
       System.out.println("***학생 목록 리스트***");
       for (int i=0; i<std1.size(); i++){
           System.out.println(std1.get(i));
       }

       //향상된 for문을 이용해 출력
       //for ( 배열에 들어있는 값을 하나씩 전달받을 변수명 : 배열이 들어있는 변수명 ) {

        for(학생 s: std1){
            System.out.println(s); //std1안에 저장되어잇는 학생들에서 s에 하나씩 학생이름, 학년 ,취미 모두 담기고
                                    //출력될 것임
        }

   }

}
