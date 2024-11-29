package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    //menu.txt
    //파일 존재 유무 확인하고 파일이 존재하면 이어쓰기 진행
    //이어쓰기 내용 : \n떡볶이, 순대, 마라탕 주문하기

     public static void main(String[] args) throws IOException {
        String path=  System.getProperty("user.home")+"/Desktop";
        File file = new File(path + "/menu.txt");

         try {
             if(file.exists()){
                 System.out.println("파일이 존재합니다. 이어쓰기를 진행합니다.");
                 FileWriter fileWriter = new FileWriter(file, true);
                 String content = "\n떡볶이\n순대\n마라탕\n아이스크림";
                 fileWriter.write(content);
                 fileWriter.close();
                 System.out.println("파일에 내용이 추가되었습니다.");
             } else {
                 file.createNewFile();
                 FileWriter fileWriter = new FileWriter(file);
                 String content = "떡볶이 순대 마라탕 주문하기";
                 fileWriter.write(content);
                 fileWriter.close();

                 System.out.println("글자 작성을 완료했습니다.");
             }

             return;
         } catch (IOException e) {
             System.out.println("예기치 못한 문제 발생");
         }
     }
         }


