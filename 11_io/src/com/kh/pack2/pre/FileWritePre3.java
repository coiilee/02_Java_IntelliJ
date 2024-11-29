package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre3 {
    /*
    * main메서드
    * 바탕화면에 menu.txt 만들고
    * 존재하면 이미 존재한다는 메세지 띄우고, 종료
    * 존재하지 않는다면 파일 생성하고 생성완료 메시지
    *
    * FileWriter 만약 파일 존재할경우 대비하여
    * 이어쓰기 모드 작성
    * 양식 한식 중식 일식 줄바꿈으로 작성
    * 생성
    * */

    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "menus.txt";
        File file = new File(path +fileName);

        //파일 존재여부 확인
//        try {
//            if(file.exists()){
//                System.out.println("이미 존재하는 파일입니다."+file.getAbsolutePath());
//                return;
//            } else {
//                file.createNewFile();
//                System.out.println("파일 생성을 완료했습니다."+fileName);
//            }
//        } catch (IOException e) {
//            System.out.println("오류 발생. 다시 시도해주세요");
//            return;
//        }
        //다른방법으로 존재여부 확인하기
        if (!file.exists()) { //파일이 존재하지 않는게 맞다면
            try {
                file.createNewFile();
                System.out.println("파일 만들기 성공했습니다."+fileName);
            } catch (IOException e) {
                System.out.println("파일 만들기에 실패했습니다. : " +e.getMessage());
                return; //파일이 없으니 작업 종료
            }
        } else { //파일이 이미 존재한다면
            System.out.println("이미 존재하는 파일입니다 : "+file.getAbsolutePath());//이미 존재하는 파일 위치 확인
            return;
        }

        //3. 파일에 글자 이어서 작성하기.
        //빨간 밑줄 위에 마우스를 대고 alt + enter 를 입력하면 선택할수 있는 항목이 표기됨
        try {
            FileWriter fw = new FileWriter(file,true); //true작성 안하면 기본적으로 false임. false(파일 존재x)이면 덮어쓰기임
            //String content = "양식\n한식\n중식\n일식";
            Scanner sc = new Scanner(System.in);
            System.out.print("작성할 내용을 입력하세요");
            String content = sc.nextLine();
            fw.write(content);
            fw.close();
            System.out.println("파일에 내용이 추가되었습니다.");
        } catch (IOException e) {
            System.out.print("글자 작성에 실패했습니다. 다음에 다시 시도해주세요.");
         } finally {
            //어떤 파일의 글쓰기 작업을 종료하는지 표기해줌
            System.out.print(fileName+ "글쓰기 작업을 종료합니다.");
        }
//        try {
//            FileWriter fw = new FileWriter(file,true);
//            String content = "양식\n한식\n중식\n일식";
//            fw.write(content);
//            fw.close();
//            System.out.println("파일 이어 작성하기 완료");
//        } catch (IOException e) {
//            System.out.println("이어작성에 실패");
//
//        } finally {
//            System.out.println("프로그램 종료");
//            return;
//        }



    }
}
