package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPre5 {
    public static void main(String[] args) {


    }
    /*
    * createFile(String 파일 경로, String 파일이름)
    * 파일 생성 기능
    *
    * @param path 파일 경로
    * @param fileName 파일이름
    * @return 파일 생성을 실패했을 경우 사용하는 것
    * */
    public void createFile(String path,String fileName) {
        File file = new File(path+fileName); //파일위치 경로 + 파일명
        if(file.exists()) {
            System.out.println("File already exists : "+fileName);
            return; //존재하기 때문에 파일생성 하지 않고 기능 종료
        } else {
            try {
                file.createNewFile();
                System.out.println("File created : "+fileName);
            } catch (IOException e) {
                System.out.println("File not created : "+fileName);
                return;
            }
        }
    }


/*
* writeFile(String 파일 경로, String 파일이름)
* 파일 안에 글자를 작성하는 기능
*
* @param path    파일 경로
* @param fileName 파일 이름
*
* */
public void writeFile(String path, String fileName){
    File file = new File(path+fileName);

    //파일 존재여부 확인
    if(!file.exists()) { //파일이 존재하지 않는게 맞다면
        System.out.println("File not exists : "+fileName);
        return;
    }
    Scanner sc = new Scanner(System.in);
    try {
        FileWriter fw = new FileWriter(file,true); //false는 덮어쓰기! true는 이어쓰기!
        System.out.print("작성할 내용을 입력하세요.");
        String input = sc.nextLine();
        fw.write(input);
        fw.close();
    } catch (IOException e) {
       System.out.println("File not written : "+fileName);
    } finally {

        sc.close();
        System.out.println("파일을 모두 작성했습니다."+fileName);
    }
}



}






















