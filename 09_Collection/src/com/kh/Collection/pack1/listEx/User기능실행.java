package com.kh.Collection.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        //1. scanner 소환
        Scanner sc = new Scanner(System.in);

        //2. user 기능 클래스 소환
        User기능 userStore = new User기능();

        while(true) {
            System.out.println("====사용자 관리 프로그램===");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 추가된 유저 목록 모두 조회");
            System.out.println("3. 유저 삭제 기능 ");
            System.out.println("4. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int choice = sc.nextInt();
           sc.nextLine(); //int에 남아있는 잔여 줄바꿈 지우기임
            //switch를 이용해 choice로 사용자가 사용하고자 하는 기능의 번호 입력받고,
            //입력받은 번호는 case를 이용해서 해당하는 기능 실행하기

            switch (choice) {
                case 1:
                    userStore.addUser();
                    break;
                    case 2:
                        userStore.allUsers();
                        break;
                        case 3:
                            userStore.removeUser();
                            //유저삭제기능
                            break;
                        case 4:
                            System.out.println("프로그램을 종료합니다.");
                            sc.close();
                            return;
                            default:
                                System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
                                break;



            }


        }
    }
}
