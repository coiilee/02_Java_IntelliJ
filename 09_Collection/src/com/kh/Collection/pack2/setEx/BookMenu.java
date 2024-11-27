package com.kh.Collection.pack2.setEx;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Book book = new Book();
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<Book>();

    //도서 추가 메소드
public void insertBook(Book book) {
    books.add(book);
    if(books.add(book)) {
        System.out.println("책이 추가되었습니다.");
    } else {
        System.out.println("이미 존재하는 책입니다.");

    }
}

    //전체 도서 목록 출력 성공 메소드
    public void selectList() {
       if(books.isEmpty()) {
           System.out.println("존재하는 도서가 없습니다.");
       } else {
           for(Book book : books) {
               System.out.println("도서 목록 : "+ books);
           }
       }
    }

    //특정 도서 검색 결과를 보여주는 메소드
    public void searchBook(String title) {
    for(Book book : books) {
    if (book.getTitle() == title){
        System.out.println(book);
            }
    }
        }

    //특정 도서 삭제 성공을 알리는 메소드
    public void deleteBook(String title, String author) {
        for(Book book : books) {
            if(book.getTitle()==title && book.getAuthor() == author) {
                books.remove(book);
            }
        }


    }


}

