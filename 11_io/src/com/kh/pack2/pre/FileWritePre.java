package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args)  {
        //바탕화면에 hello.txt 만들고
        //안녕하세요 Hello hi 넣고
        //작성후 파일 닫고 프로그램 종료하기

        String path = System.getProperty("user.home");
        File file = new File(path+"/Desktop/뉴9파일.txt");


        if (file.exists()) {
            System.out.println("파일이 이미 존재합니다.");
            return; //파일이 이미 존재하고 덮어쓰기가 돼서
                    //글 작성이 되는 것을 방지하기 위해 return 돌려보내기 추가
        } else {
            try {
                file.createNewFile();
                System.out.println("파일 생성에 성공하였습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성에 실패하였습니다.");
                return; //프로그램에서 더이상의 코드를 실행하지 않겠다는 return 돌려보내기 작성
            }
        }


        try {
            FileWriter Writer = new FileWriter(file);
            String content = "안녕하세요 \n Hello \n Hi ~ ";
            Writer.write(content);
            Writer.close();
        } catch (IOException e) {
            System.out.println("글자 작성에 실패하였습니다.");
        } finally {
            System.out.println("글쓰기 작업 종료 ");
        }


    }


}