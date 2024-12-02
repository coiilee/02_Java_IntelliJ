package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileWriteTrue {
   public void writeTxt(){
       String path = System.getProperty("user.home")+"/Desktop/";
       Scanner sc = new Scanner(System.in);
       System.out.print("내용을 이어서 작성할 파일명을 입력하세요.");
       String fileName = sc.nextLine();
       //만약에 파일이 존재하지 않는다면 파일이 존재하지 않습니다
       //파일을 생성하려면 yes 를 입력하고
       //생성하기를 원치 않는다면 no 또는 아무 글자나 입력하세요 .
       File file = new File(path + fileName);
       if(!file.exists()){
       System.out.println("파일이 존재하지 않습니다.");
       System.out.println(fileName+ "파일을 생성하시겠습니까? \n Yes = 생성 , No = 생성안함 ");
       String answer  = sc.nextLine();
       //만약에 equalsIgnoreCase 이용해서 yes를 입력하면 파일 생성하기 기능 실행 createNewFIle():


           try {
               if (answer.equalsIgnoreCase("yes")) {
                   file.createNewFile();
                           System.out.println("파일을 생성했습니다: " + file.getAbsolutePath());
                   }
           } catch (IOException e) {
               System.out.println("오류 발생" + e.getMessage());
           }

           try (FileWriter fw = new FileWriter(file, true)) {
           String input;
           while (true) {
               System.out.print("내용을 입력하세요 (종료하려면 exit 입력): ");
               input = sc.nextLine();

               if (input.equalsIgnoreCase("exit")) {
                   System.out.println("프로그램을 종료합니다.");
                   return;
               }
               fw.write(input+"\r\n");
               System.out.println(input + " 내용이 추가되었습니다!");
           }
       } catch (IOException e) {
           System.out.println("오류 발생: " + e.getMessage());
       }}}}
