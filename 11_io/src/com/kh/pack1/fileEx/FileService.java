package com.kh.pack1.fileEx;

import java.io.File;

public class FileService {
    //method1.  File클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성해보자
    public void method1(){
        //C:/Users/user1/바탕화면>
        //C:/Users/user1/Desktop>

        //만약 바탕화면에 만들고싶다면 ?

        File 폴더 = new File("Users/user1/Desktop/newFolder");

        System.out.println("폴더 위치 : "+폴더.getPath());
        System.out.println("폴더 절대경로: "+폴더.getAbsolutePath());
        //폴더 절대경로           : C:/newFolder
        System.out.println("폴더 이름: "+폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : "+폴더.exists());

        //폴더 생성
        폴더.mkdir();
        System.out.println("폴더 생성을 완료했습니다.");
    }
}
