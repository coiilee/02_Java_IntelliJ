package com.kh.inheritanceEx;
//자식이 부모의 무언가를 상속받음!
public class 자식 extends 부모 {
    //추가 필드
    private String 취미;

    //기본생성자
    public 자식() {
        super(); // 부모의 기본 생성자를 무조건적으로 호출하기 때문에 super
    }
    //필수생성자
    public 자식(String 성씨, String 주소, int 돈, String 차){
        super(성씨,주소,돈,차); // 부모한테 무조건 물려받는 것이기 때문에
        //부모 클래스의 필수 생성자를 호출
        this.취미=취미;
    }

    //Setter
    public void set취미(String 취미){
        this.취미 = 취미;
    }

    //Getter
    public void get취미(String 취미){
        this.취미 = 취미;
    }
}
