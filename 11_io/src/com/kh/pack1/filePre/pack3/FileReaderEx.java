package com.kh.pack1.filePre.pack3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    //FileReaderEx 내 method1() 기능을 사용해서 텍스트 파일을 읽고 출력
    //lunch.txt를 읽고 출력하기

    public void method1(){
        try {
            FileReader fr = new FileReader(System.getProperty("user.home")+"/Desktop/lunch.txt");
            BufferedReader br = new BufferedReader(fr);//성능 향상용 객체
            String line = br.readLine(); //변수 선언만 하고 아무 값도 들어있지 않는 상태

            //while 내부에 readLine()을 작성하지 않으면 계속 똑같은 줄만 바라보고 있음! ! !
            while ((line = br.readLine()) != null) { //한 줄씩 읽고 null이 아닐 때만 반복
                System.out.println(line); //현재 읽은 줄 출력
            }
            br.close();
            fr.close();
        } catch (IOException e) {
           System.out.print(e.getMessage()+" 의 문제가 발생했습니다.");
        }

    }

}
