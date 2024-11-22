package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {

public static void main(String[] args) {
    PersonPre personPre = new PersonPre();
    Scanner sc = new Scanner(System.in);

    System.out.println("이름 : ");
    String name = sc.nextLine();

    System.out.println("나이 : ");
    int age = sc.nextInt();


    if (name.trim().length()<=0) {
        System.out.println("이름은 빈칸으로 들어갈 수 없습니다.");
    }else {
        personPre.setName(name);
        }

    if(age<=0) {
        System.out.println("나이는 음수일 수 없습니다.");
    } else {
        personPre.setAge(age);
    }

    if(personPre.getName() !=null && personPre.getAge() > 0) {
        System.out.println("이름 : " +personPre.getName());
        System.out.println("나이 : " +personPre.getAge());
    }






    //스캐너로 사용자 이름 나이 입력받기
    //이름 빈칸이면 빈칸은 이름으로 드렁갈수 없습니다 뜨게

    //나이가 0보다 같거나 작다면 나이가 음수일 수 없습ㄴㅣ다. 값설정 x
    //이름이 제대로 들어가잇고 나이가 제대로 설정되어 있다면 get으로 이름, 나이 출력하기
}
}