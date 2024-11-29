package com.kh.pack2;

import java.io.*;

public class FileReadWrite {
    //파일을 바탕화면에 만들고, 파일 안에 글자 작성하기
    public void method1(){

        System.getProperty("user.home"); //c/users/user1 + /바탕화면
        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");//c users user1 바탕화면에서 ex1.txt 만들기
        //기존에는 createNewFile() 이용해서 생성

        if(file.exists()){ //파일이 존재하지 않는 경우 파일 생성
            System.out.println("파일이 존재합니다.");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 만들기에 실패했습니다.");
            }

            //생성된 파일에 글자를 작성해보자~~
            //글자를 작성할 때 BufferedWriter FileWriter 를 사용해서 작성
            try { //파일 안에 글을 작성하는 건 문제가 많을 수 있기 때문에 예외 상활 감지하는 try-catch문 사용
                FileWriter writer = new FileWriter(file); //File안에 Writer 글자를 작성
                String content = "안녕하세요. 반갑습니다. 환영해요";
                writer.write(content); //파일쓰기 기능으로 파일안에 글자를 쓸 기능 호출, ()안에 작성할 내용
                writer.close(); // 파일에 글자를 작성하고 나면 닫아줘야함 ~! !!!!!!!!!!!!!!!!
                System.out.println("파일에 내용이 작성되었습니다.");
            } catch (IOException e) {
               System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
            } finally {
                System.out.println("글쓰기 작업을 종료합니다.");
            }
        }


    }

    //만들어진 파일에 이어서 글자 작성하기 (feat. FileWriter)
    //true를 작성하지 않으면 기본적으로 false 상태로 파일이 존재할 경우 덮어쓰기 진행하는 것임.
    //FileWriter fw = new FileWriter("파일명", true) true파일 이어쓰기 모드 활성화
    public void method2(){
        System.getProperty("user.home"); //c/users/user1 + /바탕화면
        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");

        //FileWriter를 이용해 이어쓰기 진행
        try {
            FileWriter fw = new FileWriter(file, true);
            String content = "이어서 작성한 내용입니다.";
            fw.write(content);
            fw.close();
            System.out.println("파일 이어서 작성하기 완료했습니다.");
        } catch (IOException e) {
            System.out.println("이어서 작성하기 실패했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    //만들어진 파일을 읽고 눈으로 어떤 내용이 작성되어 있는지 확인
    //FileReader     : 파일로부터 문자 데이터를 읽어들이는 클래스  -> 한글자씩 읽음
    //BufferedReader : FileReader에 버퍼링 기능 추가한 클래스   -> 한줄 단위로 읽음
     //                줄 단위로 데이터를 읽을 수 있어 빠르고, 성능이 좋음
    public void method3(){

        String path = System.getProperty("user.home")+"/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader(System.getProperty("user.home")+"/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file); //한 줄 단위로 읽는 성능 좋은 부스터 붙인 것
            String line; //한줄씩 읽어오는 readLine() 기능 설정해준 것
            //String line = br.readLine();
            //반복문을 이용해서 읽는 것이 끝날 때까지 계속 반복
            while((line = br.readLine())!=null){ //null = 더이상 읽을게 없을 때까지 계속 출력하라는 뜻
                System.out.println(line);
            }
            br.close(); //한줄씩 읽는 것부터 먼저 종료
            file.close(); //한글자씩 가져오는 객체 종료
            /*
            * FileReader가 읽는 것이 느리기 때문에 , BufferedReader가 빠르게 읽을 수 있도록 도와줌
            * FileReader를 도와주기 위해 생성된 BufferedReader를 먼저 종료시키고,
            * 그 다음 FileReader 를 종료시키는 것.
            *
            * */
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method4(){

        String path = System.getProperty("user.home")+"/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader(System.getProperty("user.home")+"/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file);

            String line = br.readLine();//글자를 담고 출력할 공간 생성
            while((line = br.readLine())!=null){  ////line이라는 공간에 한 줄의 글자들이 담기고
                System.out.println(line); //line이라는 변수명에 담겨진 글자를 출력한 다음 다음줄이 아예 없을 때까지 계속해서 출력을 진행하는것
                            //복사기에서 5페이지 출력위해 1페이지 출력하고, 2페이지를 출력하는 것과 같은 형식
            }

            br.close();
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





















