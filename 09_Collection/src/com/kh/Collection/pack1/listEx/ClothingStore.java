package com.kh.Collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
   private ArrayList<Clothing>clothing1 = new ArrayList<Clothing>();
        Scanner scanner = new Scanner(System.in);

    //1.옷 추가 기능
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

    //2.추가된 옷 리스트 확인하는 기능
    public void allClothing(){
//만약 등록된 옷 목록이 존재하지 않는다면
        System.out.println("===옷 목록 출력하기===");
        if (clothing1.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        }else {
            // 하나씩 c 라는 변수명에 옷이름 카테고리 가격을 담아서
            for (Clothing clothing : clothing1) { //clothingList 에 담겨있는 옷들을
                System.out.println(clothing);
            }
        }


    }

    //3. 리스트에 있는 옷들 중에서 삭제하고자할 옷을 선택해서 제거하기
    //Book이랑 다르게 제거하고자 하는 책제목을 Run에서 입력하는 것이 아니라 기능클래스에서 작성한 버전
    //결과는 같지만 방법이 다름을 표현
    public void removeClothing(){
        System.out.println("\n === 옷 제거 ===");
        System.out.print("제거하고자 하는 옷의 이름을 입력하세요 : ");
        String name = scanner.nextLine(); //제거하고자 하는 옷의 이름을 작성

        boolean found = false; //옷을 삭제했는지 확인하기 위한 변수. 현재는 아무것도 한게 없기 때문에 false
        for(int i = 0; i < clothing1.size(); i++) {
            if (clothing1.get(i).getName().equals(name)) { //i번째 있는 옷이름과 삭제하고자 하는 옷 이름이 일치한다면
                clothing1.remove(i);
                System.out.println("["+name+"]옷이 성공적으로 제거되었습니다.");
                found = true; //찾았기 때문에 true
                break; //삭제 후 for문 종료
            }
        }
        //위 for문 코드에서는 만약 삭제하고자 하는 옷이름과 옷목록 리스트에 작성된 옷이름이 일치한다면 삭제한 상태
        //아래 if문 코드에서는 옷 이름 검색했을 때 검색한 옷이름이 없다면 옷을 찾을 수 없다 라는 표기를 작성해줘야
        //유저들이 옷이 없구나 라는 것을 알 수 있음.
        if (!found) {
            System.out.println("["+name+"]옷을 찾을 수 없습니다.");
        }
    }




}
