package com.kh.poly.pack2.bookPre;

//도서의 제목(String title) 저자(String author) 가격(int price) 정보
public class Book {

    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    //부모 클래스에서 toString 사용하지 않으면 , Run출력에 아래와 같이 오류나옴
    //com.kh.poly.pack2.bookPre.Ebook@41629346fileSize='15.15MB'}
    //com.kh.poly.pack2.bookPre.PrintBook@15aeb7abshippingCost=3000}
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
