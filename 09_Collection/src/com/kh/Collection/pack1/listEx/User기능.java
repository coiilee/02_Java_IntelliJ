package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> userList = new ArrayList<>();
    //2. 스캐너 사용
   private Scanner sc = new Scanner(System.in);
   //3. 사용자 추가 기능 만들기 !
    public void addUser() {
        System.out.println("이름 : ");
        String username = sc.nextLine();

        System.out.println("비밀번호 : ");
        String password = sc.nextLine();

        System.out.println("이메일 : ");
        String email = sc.nextLine();

        User user = new User(username, password, email);
        userList.add(user);

        System.out.println("["+username+"등록 완료]");
    }
    // 유저 삭제하기
    public void removeUser(){
        System.out.println("\n === 유저 삭제 ===");
        System.out.print("제거하고자 하는 유저를 입력하세요 : ");
        String username = sc.nextLine();

        boolean found = false;
        for(int i=0; i<userList.size(); i++) {
            if(userList.get(i).getUsername().equals(username)) {
                userList.remove(i);
                System.out.println("["+username+"]이 제거되었습니다. ");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("["+username+"]을 찾을 수 없습니다.");
        }


    }
    //4. 유저 목록 조회하기
    public void allUsers(){
        System.out.println("====추가된 사용자 목록====");
        if(userList.isEmpty()){
            System.out.println("등록된 사용자가 없습니다.");
        } else {
        for (User user : userList) {
            System.out.println(user);
        } }


//
//        if(userList.isEmpty()){
//            System.out.println("등록된 사용자가 없습니다.");
//        } else {
//            for (int i = 0; i < userList.size(); i++) {
//                System.out.println(userList.get(i));
//            }
//        }

    }

}
