package com.kh.Collection.pack2.setEx;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMenu bookMenu = new BookMenu();

        while (true) {
            System.out.println("====Welcome kh Library====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴 번호 입력 : ");
            int choice = sc.nextInt();
            sc.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("도서명 : ");
                    String title = sc.nextLine();
                    System.out.print("저자명 : ");
                    String author = sc.nextLine();

                    // 카테고리 번호 입력 받기
                    System.out.println("장르 선택 (1.인문 / 2.과학 / 3.외국어 / 4.기타) : ");
                    int categoryNumber = sc.nextInt();
                    sc.nextLine();

                    // categoryNumber를 해당 문자열로 변환
                    String category = ""; // 카테고리 이름을 저장할 변수
                    switch (categoryNumber) {
                        case 1:
                            category = "인문";
                            break;
                        case 2:
                            category = "과학";
                            break;
                        case 3:
                            category = "외국어";
                            break;
                        case 4:
                            category = "기타";
                            break;
                        default:
                            System.out.println("잘못된 카테고리 번호입니다.");
                            category="기타";
                            break; // 잘못된 입력 시 종료
                    }

                    // 가격 입력 받기
                    System.out.print("가격 : ");
                    int price = sc.nextInt();
                    sc.nextLine(); // Clear the buffer

                    // Book 객체 생성 및 추가
                    Book book = new Book(title,author,category,price);
                    bookMenu.insertBook(book);
                    break;

                case 2:
                    System.out.println("=== 도서 전체 조회 ===");
                    bookMenu.selectList();
                    break;

                case 3:
                    System.out.println("=== 도서 검색 ===");
                    System.out.print("제목으로 검색 결과 : ");
                    String bookTitle = sc.nextLine();
                    bookMenu.searchBook(bookTitle);
                    break;

                case 4:
                    System.out.println("=== 도서 삭제 ===");
                    System.out.print("삭제할 도서명 : ");
                    String removeTitle = sc.nextLine();
                    System.out.print("삭제할 저자명 : ");
                    String removeAuthor = sc.nextLine();
                    bookMenu.deleteBook(removeTitle, removeAuthor);
                    break;

                case 5:
                    System.out.println("종료");
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
