package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileService {
    //method1.  File클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성해보자
    public void method1(){
        //C:/Users/user1/바탕화면>
        //C:/Users/user1/Desktop>

        //만약 바탕화면에 만들고싶다면 ?

        File 폴더 = new File(System.getProperty("user.home")+"/Desktop/newFolders");

        System.out.println("폴더 위치 : "+폴더.getPath());
        System.out.println("폴더 절대경로: "+폴더.getAbsolutePath());
        //폴더 절대경로           : C:/newFolder
        System.out.println("폴더 이름: "+폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : "+폴더.exists());

        //폴더 생성
        //폴더가 존재하는지 존재하지않는지 확인하고 폴더 생성하기
        if(폴더.exists()){
            System.out.println("이미 존재하는 폴더입니다.");
        }else {
            폴더.mkdirs();
            System.out.println("폴더 생성을 완료했습니다.");
        }
        폴더.mkdir();
        System.out.println("폴더 생성을 완료했습니다.");
    }

    //File 클래스 객체 이용해서 파일이 존재하는지 확인, 존재하지 않으면 파일 생성
    public void method2(){
        File file = new File(System.getProperty("user.home")+"/Desktop/내파일.txt");

        if(file.exists()){
            System.out.println("이미 바탕화면에 존재하는 파일입니다.");
        }else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("파일을 만드는데 문제가 발생했습니다.");
            }
            System.out.println("파일이 성공적으로 생성되었습니다.");
        }
    }

    //method3 File 클래스 객체를 이용해서 특정위치 폴더에 있는 모든 파일과 폴더를 배열 형태로 가져오기
    public void method3(){
        System.out.println("확인하고자 하는 폴더 경로 : "+System.getProperty("user.home")+"/Downloads");
        //file에서 C:/Users/user1/Downloads 위치까지 설정해준 것
        // \는 \n 과같은 특수문자 규칙과 부딪힐 수 있기 때문에 되도록이면 / 로 변경해서 사용하기.
        File file = new File(System.getProperty("user.home")+"/Downloads");

        //특정 폴더 위치에 있는 파일과 폴더들을 배열 형태로 가져올 것
        File[] files = file.listFiles(); //C:/Users/user1/Downloads 에 있는 것들 모두 목록형태로 가져오기

        //향상된 for문을 이용해서 출력
        for(File file1 : files){ //일반 for문이 아니라 향상된 for문 사용
            System.out.println("파일 이름 : " +file1.getName()); // 파일이름들을 가져올 수 있음
            System.out.println("파일 크기 : " + file1.length() + "바이트");
            System.out.println("마지막 수정 날짜 : "+file1.lastModified());
            //마지막 수정 날짜 : 1730440407919 -> 1970년 1월 1일부터 지난 일자
            //마지막 수정 날짜를 사람들이 눈으로 확인하기 좋은 날짜 형식으로 변환하자

            //SimpleDateFormat 은 간단히 날짜 형식을 지정할 수 있는 객체.
            long lastModified = file1.lastModified();
            Date date = new Date(lastModified);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //날짜 형식을 문자열 형태로 변환
            String formatDate = sdf.format(date); //1731660312497 -> sdf형식으로 변경해서 문자열로 전달
            //Cannot format given Object as a Date :파일의 마지막 수정 날짜를 최대한 큰 공간으로 가져온 뒤 Date 변환
            //가장 큰 공간 : long으로 가져와서 변환. -> 왜냐하면 날짜의 끝을 제대로 담으라는 의미.
            System.out.println("사람이 읽기 편한 날짜 형식으로 변경 :" + date);

        }
    }
}

























