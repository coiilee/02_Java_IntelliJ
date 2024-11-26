package com.kh.Collection.pack1.listEx;
//컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
//java.util 이라는 폴더 안에 있음.

//특징
//1) 크기 제한 없음(부족하면 자동으로 증가)
//2) 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음

import java.util.ArrayList;

public class BookService {

    //List : 자료를 순차적으로 나열한 자료 구조(배열과 비슷)
    //- 인덱스가 존재함
    //  -> 인덱스로 순서가 구분되기 때문에 중복으로 데이터 저장 가능

    /**
     * List 사용해보기
     **/
    public void method1(){
        //List 객체 생성
        //- List(인터페이스) -> 객체로 보기 어려움 객체 생성 불가 -> 다형성 이용해야함
        //  List 기능을 물려받은 ArrayList(클래스) 활용

        int arr1[] = new int[3]; //이 안에는 정수형으로 3개의 값만 들어갈 수 있음
        String arr2[] = new String[3]; // 이 안에는 문자열로 3개의 값만 들어갈 수 있음

        arr1[0] = 10; //index 0번째 자리에 10을 넣는다는 의미.

        //List1은 숫자 넣기 가능, 문자넣기 가능, 문자열 넣기 가능 모든값을 넣을 수 있음.
        ArrayList list1 = new ArrayList(3); //3칸짜리 배열을 생성하는 것

        list1.add(1); //알아서 자동으로 index = 0 번째 자리에 1이라는 값이 들어감
        list1.add("아무거나 넣을 수 있어여"); // 알아서 자동으로 index = 1 자리에 문자열이 들어감. .
        list1.add(123); //
        list1.add(false); //자료형 boolean. 3칸으로 되어있는 list의 크기가 4칸으로 자동으로 늘어남. 오류 x
        System.out.println(list1);

        //배열의 길이 : length
        // 리스트의 길이 : size() -> List 에 저장된 요소(객체)의 개수를 반환
        System.out.println("list1에 저장된 값의 개수 : "+list1.size());
    }
    /*
    List에서 원하는 자료형만 넣을 수 있또록 자료형 제한 설정하기
    * */
    public void method2() {
        //String 타입으로 제한된 ArrayList 생성
        /*
        String 타입으로 제한된 ArrayList 객체 생성 방법은 여러가지가 존재
        개발자가 담길 원하는 타입을 제한했다면 앞 뒤로 완벽하게 String만 사용할 수 있도록 설정해주는 것이 좋음.
        담는 공간 모두 String            =   담는 값이 String.
        **ArrayList<원하는 자료형> list1 = new ArrayList<원하는 자료형>();*** -> 이 방법 주로 사용하기.
        ArrayList list1 = new ArrayList<원하는 자료형>();
        ArrayList<원하는 자료형> list1 = new ArrayList<>();
         */

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
//        list1.add(1123); //문제가 지금은 되지 않지만, 추후 코드 흐름에서 문제가 생길 가능성이 큼.

        list1.add("족발");
        System.out.println(list1);
        System.out.println("method2에 저장된 값의 개수 : "+list1.size()); //총 갯수 세기
    }

    //책을 추가할 수 있도록
    private ArrayList<Book> bookList = new ArrayList<>();
    //한번에 책이름, 저자, 가격을 저장하고 볼 수 있도록 설정

    //1. 책 추가하기 기능 만들자 !
    public void addBook(String title, String author, int price){
        Book b1 = new Book(title, author, price);
        bookList.add(b1);
        // bookList.add(new Book(title, author, price)); 와 동일
        System.out.println(bookList);
        System.out.println("책이 성공적으로 추가되었습니다.");

    }

    //3. 저장된 책 모두 확인하기
    //               Book =  책제목,   저자,     가격      = 하나의 세트
    // index0번에 저장된 값들 : [Book{title='나는책이ㅏ', author='kht', price=30000}]
    public ArrayList<Book> getBookList() {
        return bookList; //get 가지고 있는 모든 책 리스트를 호출해서 전달하기
    }


}
















