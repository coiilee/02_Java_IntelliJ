package com.kh.Collection.pack1.listEx;

import java.util.Scanner;

public class BookServiceRun {
    public static void main(String[] args) {
    BookService bookService = new BookService();
//    bookService.method1();
//    bookService.method2();

        Scanner scanner = new Scanner(System.in); //html 연결 사용 x
        while(true){
            System.out.println("\n === 책 매니저 === ");
            System.out.println("1. 책 추가하기");
            System.out.println("2. 책 제거하기");
            System.out.println("3. 모든 책 리스트 확인하기");
            System.out.println("4. 종료");
            System.out.println("번호만 입력하세요 : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //남아있는 잔여 값들 혹시 모르니 처리하기

            switch (choice) {
                case 1:
                    System.out.print("책제목을 입력하세요");
                    String title = scanner.nextLine();
                    System.out.print("저자를  입력하세요");
                    String author = scanner.nextLine();
                    System.out.print("팔고자하는 가격을 입력하세요 :");
                    int price = scanner.nextInt();
                    scanner.nextLine();

                    //책 저장하기 기능 Bookservice에서 설정
                    bookService.addBook(title, author, price);
                    break;
                    case 2:
                        System.out.print("지우고자 하는 책의 제목을 입력하세요 :");
                        String removeTitle = scanner.nextLine();

                        //만약 책 제목이 존재한다면 책을 삭제했습니다.

                        //만약 책이 없다면 책 제목을 찾을 수 없습니다.
                        break;
                        case 3:

                            //책 리스트를 모두 보는 곳
                            bookService.getBookList();
                            System.out.println(bookService.getBookList());
                            //만약 책이 하나도 없다면
                            //판매할 수 있는 책 리스트가 없습니다 .

                            //책이 존재한다면 모든 책 리스트 보여주기
                            break;

                            case 4:
                                System.out.println("책 매니저를 종료합니다. 안녕~");
                                return;
                                default:
                                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
}

}
