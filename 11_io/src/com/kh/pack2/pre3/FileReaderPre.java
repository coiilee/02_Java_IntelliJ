package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    // 파일을 읽고 읽은 내용을 눈으로 확인
    // happyLunch.txt
    /**
     * readTxt(String path, String fileName)
     *
     * @param path     = 파일경로
     * @param fileName = 파일이름
     * */
    public void readTxt(String path, String fileName){
        try {
            FileReader fr = new FileReader(path + fileName);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없는 문제 이외에 다른 문제가 발생했습니다. : " + e.getMessage());
        }
    }
}