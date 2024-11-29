package com.kh.pack1.filePre.pack3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    //파일을 읽고 읽은 내용을 눈으로 확인
    //happyLunch.txt
    /*
    * readTxt(String path, String fileName)
    *
    * @param path =파일경로
    * @param fileName = 파일 이름
    * */

    public void readTxt(String path , String fileName){
        System.getProperty("user.home");
        String locate = System.getProperty("user.home")+"/Desktop/happyLunch.txt";
        File file = new File(path+fileName);

        try {
            if(file.exists()){
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()+" 에서 오류 발생");
        }
    }
}
