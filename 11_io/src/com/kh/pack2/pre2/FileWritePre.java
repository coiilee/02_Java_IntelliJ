package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre {
    // * createTxt(path,fileName)
    // * @param path = 파일 경로
    // * @param fileName = 파일 이름
    // *
    // *

    public void createTxt(String path,String fileName){
        File file = new File(path+fileName);

        try {
            if(file.exists()){
                System.out.println("파일이 존재합니다." + fileName);
                return;
            } else {
                file.createNewFile();
                System.out.println("파일을 생성했습니다." + fileName);
            }
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다." + fileName + e.getMessage());
        }

    }

    public void writeTxt(String path,String fileName){
        File file = new File(path+fileName);

        try {
            FileWriter fileWriter = new FileWriter(file,true);
            Scanner sc = new Scanner(System.in);
            System.out.println("작성할 내용을 입력하세요.");
            String content = sc.nextLine();
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("내용이 추가되었습니다." + fileName);
        } catch (IOException e) {
            System.out.println("내용 작성에 실패했습니다." + fileName);
        } finally {
            System.out.println("글쓰기 작업을 종료합니다." + fileName);
        }


    }

}
