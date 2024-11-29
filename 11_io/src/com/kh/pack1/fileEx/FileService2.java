package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService2 {

    //1. System.getProperty()알아보기
    public void method1() {
        /*
        * System.getProperty()는 Java에서 현재 실행중인
        * 특정 시스템의 속성 정보를 가져오는데 사용하는 기능
        * 시스템에 대한 환경 정보나 설정 값을 얻는데에 유용
        *
        * 변수이름으로 값을 담기 원한다면 변수명 맨 앞에
        * 자료형으로 String 사용 !
        * String 변수이름 = System.getProperty(String 키);
        *
        * 키종류                  키에 해당하는 값
        * java.version          java Version 확인
        * java.home             java가 설치된 경로
        * os.name               windows / Linux / macOs 인지 확인 가능
        * user.name             현재 컴퓨터를 사용하는 사용자 이름
        * user.home             현재 사용자 홈 폴더 경로
        * user.dir              현재 작업하고 있는 폴더
        *
        * 위와 같은 내용을 확인하기 위해서는
        * System.out.print를 이용해 눈으로 확인할 수 있음
        * */

        String a = System.getProperty("user.home"); //유저 홈에 대한 정보를 가져오기만 한 상태
        //왜냐하면 출력해서 보겠다라는 표기를 안했기 때문!
        System.out.println(System.getProperty("user.home"));

        //운영체제 정보 출력
        String osName = System.getProperty("os.name");
        System.out.println("운영체제 이름 : "+osName);
        //사용자 정보
        String userName = System.getProperty("user.name");
        System.out.println("사용자 이름 : "+userName);

    }
}










