package com.kh.poly.pack2.bookPre;
//Book 클래스만 상속받음
//전자책만의 추가 필드 파일크기(String fileSize)를 가짐
public class Ebook extends Book {

    private String fileSize;

    public Ebook() {

    }

    public Ebook(String title, String author, int price, String fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "fileSize='" + fileSize + '\'' +
                '}';
    }
}
