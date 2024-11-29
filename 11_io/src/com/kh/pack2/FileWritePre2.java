package com.kh.pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    public static void main(String[] args) {
        //바탕화면에 lunch.txt
        //먹고싶은 점심메뉴 리스트를 줄바꿈 이용해 작성하고
        //파일이 존재한다면 이미지 존재합니다와 동시에 프로그램 return으로 종료
        //main 메서드 작성

        String path = System.getProperty("user.home");
        File file = new File(path + "/Desktop/lunch.txt");

        if (file.exists()) {
            System.out.println("파일이 이미 존재합니다.");
            return;
        } else {
            try {
                file.createNewFile();
                System.out.println("파일을 생성 완료했습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성에 실패했습니다.");
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        try {
            FileWriter fw = new FileWriter(file);
            String content = "치킨마요 \n 돈까스 \n 김밥 \n 잔치국수 \n 텐동 \n 자루우동";
            fw.write(content);
            fw.close();
            System.out.println("파일에 점심메뉴 리스트가 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("작성에 실패했습니다. 다시 시도해주세요.");
        } finally {
            System.out.println("글쓰기 작업을 종료합니다.");
        }

        }
    }
}