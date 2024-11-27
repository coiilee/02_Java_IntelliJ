package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        //1. Scanner 소환
        Scanner sc = new Scanner(System.in);

        //2. ClothingStore 소환
        ClothingStore store = new ClothingStore();

        while(true){
            System.out.println("\n--- 쇼핑몰 옷 관리 프로그램---");
            System.out.println("1.옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 옷 제거하기");
            System.out.println("4. 프로그램 종료");
            System.out.println("메뉴선택 : ");
            int choice = sc.nextInt();
            sc.nextLine(); //int에 남아있는 잔여 줄바꿈 지우기
            //switch choice로 사용자에게 특정 번호를 받고
            //특정 번호에 맞는 case에서 해당하는 기능을 실행할 수 있도록 만든 조건문
            switch (choice) { //위 choice에서 가져온 숫자 번호에 해당하는 case 를 선택할 수 있도록 하는 기능
                case 1:
                    store.addClothing(); //Clothingstore에서 작성된 옷 추가 기능
                    break;
                    case 2:
                        store.allClothing(); //Clothingstore에서 작성된 옷 모두 보기
                        break;
                        case 3:
                            //옷 제거하기 기능 추가
                            store.removeClothing();
                            break;
                        case 4:
                            System.out.println("옷가게를 종료합니다.");
                            return; //while문이 종료됨
                        default:
                            System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
                            break;
            }
        }

    }



}
