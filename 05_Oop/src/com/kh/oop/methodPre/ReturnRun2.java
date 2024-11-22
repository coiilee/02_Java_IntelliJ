package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 pre2 = new ReturnPre2();
//1번
        String result = pre2.method1("홍길동", 40);
        System.out.println(result);

//2번
        pre2.method2(123, 456);
        System.out.println("method2 출력확인: " + pre2.method2(123, 456));

//        //3번
//        pre2.method3(85);
//        System.out.println("method3 출력확인: " + pre2.method3(85));

        //4
        pre2.method4(100000, 20);
        System.out.println("method4 출력확인: " + pre2.method4(100000, 20));

        //6
        pre2.method6(17);
        System.out.println("method6 출력확인: " + pre2.method6(17));

        //7
        pre2.method7("Hello", "World");
        System.out.println("method7 출력확인: " + pre2.method7("Hello", "World"));

        //8
        String arr[] = {"apple", "banana", "cherry"};
        pre2.method8(arr, "banana");
        System.out.println("method7 출력확인: " + pre2.method8(arr, "banana"));

        //9
        pre2.method9(7, 153.93804002589985);
        System.out.println("method9 출력확인: " + pre2.method9(7, 153.93804002589985));


    }}
