package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePre2 {

    //method1
    //사용자 -> user1 -> front-workspace -> 01_html
    //폴더 위치가 맞는지 확인하고
    //폴더 위치에 들어있는 파일이름, 파일 마지막으로 수정한 날짜 출력
    public void method1() {
        String folderPath = System.getProperty("user.home")+"front-workspace/01_html";
       System.out.println("폴더 위치가 맞는지 확인 : "+folderPath);

       //file 객체 생성
       File file = new File(folderPath);

       //폴더 안 파일이나 폴더 목록 가져오기
       File[] files = file.listFiles();
       //파일 날짜 지정할 포맷 설정
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd- HH:mm:ss");
       //파일 정보 출력
       for( File f : files ) {
           System.out.println("f에 대한 모든 정보 출력 : "+f.toString());
           System.out.println("파일이름 : " + f.getName());
           String lastDate = simpleDateFormat.format(f.lastModified());
           System.out.println("마지막으로 수정한 날짜 : " + lastDate);


       }


    }
}
