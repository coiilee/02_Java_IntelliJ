package com.kh.oop.methodex;

public class Void메서드실행 {
    public static void main(String[] args) {
        Void메서드 v1 = new Void메서드();
        v1.method1();


        String userID = "홍길동";
        v1.method2(userID);

        int age = 40;
        v1.method3(age);

//        String name = "이다경";
//        int age2 = 29;
        //method4의 경우 String,int 순서대로 값을 넣어주겠다고 표기해놨기 때문에,
        //1번 자리에는 String 과 같은 무자열이 들어가야함
        //2번 자리에는 int 와 같은 정수형이 들어가야함.
        v1.method4("이다경",29);

        String id = "kht";
        String pw = "kht1121@";
        v1.login(id,pw);
    }

}
