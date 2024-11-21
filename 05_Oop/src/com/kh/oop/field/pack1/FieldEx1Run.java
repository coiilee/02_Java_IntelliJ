package com.kh.oop.field.pack1;

class FieldEx1Run{
    public static void main(String[] args){
        //FieldEx1 객체 생성 
        FieldEx1 f1 = new FieldEx1();
        f1.method1();
        //변수에 무엇이 적혀있는지 출력문 통해 확인하기
        System.out.println(f1.퍼블릭필드);
        System.out.println(f1.프로텍트필드);
        System.out.println(f1.디폴트필드);



    }
}
