package com.kh.oop.methodPre;

import javax.swing.*;

public class ReturnPre2 {

    //1.이름과 나이를 입력받아 소개 메세지 반환
    //안녕하세요! 제 이름은 홍길동이고, 나이는 40세입니다.

    public String name = "홍길동";
    public int age = 40;

    public String method1(String name, int age) {
        String result = "";
        result = ("안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
        return result;
    }

    //2. 두 숫자를 입력받아 가장 큰 숫자를 반환 Scanner 아님
    //num1, num2 비교해서 큰 값의 숫자를 출력하기

    public String method2(int num1, int num2) {
            if (num1> num2) {
                return num2 +"보다" +num1 +"이 더 큰 숫자입니다.";
            } else{
            return num1 +"보다" +num2 +"이 더 큰 숫자입니다.";
        }
    }

        //3. 입력된 점수에 따라 등급 반환
        //(switch 나 if-else if 활용)
        //문제: 점수를 입력받아 등급을 아래와 같은 형식으로 출력하세요.
        //출력 결과:  입력한 점수: 85 등급: B

//    public char method3(int score){
//        char grade;
//              if(score>=90){
//                  grade 'A';
//        } else if (score>=80){
//                      grade 'B';
//              } else if (score>=70){
//                  grade 'C';
//              } else {
//                  grade 'D';
//    }       return grade; }


//    4. 상품 가격과 할인율을 입력받아 최종 금액 반환
//    (가격 - 가격 * 할인률 / 100)
//    문제: 상품 가격과 할인율을 입력받아 할인된 금액을 계산하여 출력하세요.
//    출력 결과: 원래 가격: 100000원 할인율: 20% 최종 금액: 80000원


    public String method4(double price,double discountRate){
        double totalPrice = price - (price * discountRate/100);
        return "원래가격: "+price +"원 할인율 :"+ discountRate+ "%최종금액 : " + totalPrice + "원";
        }



//5. 배열의 평균값 반환
//            (향상된 for문과 +=문     sum / numbers.length 활용)
//    문제: 주어진 배열의 평균값을 아래와 같이 출력하세요.
//    출력 결과: 배열: [10, 20, 30, 40, 50] 평균값: 30.0
//




//            6. 주어진 나이가 성인인지 확인하고 메시지 반환
//            (삼항연산자나 if문 활용)
//    문제: 나이를 입력받아 성인 여부를 판단하고 메시지를 출력하세요.
//    출력 결과: 나이: 17 결과: 미성년자입니다.
//
        public String method6(int age){
            //(조건식) ? true : false ;

         //   return (age>=19) ? "성인입니다" : "미성년자입니다.";

          String result = (age>=19) ? "성인입니다." : "미성년자입니다.";
          return "나이: " + age + "결과 : " + result ;
        }




//7. 두 문자열을 연결한 뒤 반환
//            (문자열 + 로 이어붙이기)
//    문제: 문자열 두 개를 입력받아 연결된 결과를 아래와 같이 출력하세요.
//    출력 결과: 입력된 문자열: "Hello", "World" 연결된 문자열: "Hello World"
//
    public String method7(String str1, String str2) {
        return "첫번째로 이볅된 문자열 : " +str1 + "\n 두번째로 입력한 문자열 :"+ str2
                + "\n위 두 문자열을 이어붙인 결과 : " + str1+str2;
//        String result = str1 + str2;
//        return "첫번째로 이볅된 문자열 : " +str1 + "\n 두번째로 입력한 문자열 :"+ str2
//                + "\n위 두 문자열을 이어붙인 결과 : " + result;
        }



//8. 특정 문자열이 배열에 존재하는지 확인 후 결과 반환
// (향상된 for문과 if문 조합)
// 문제: 주어진 배열에서 특정 문자열이 존재하는지 확인하고 결과를 출력하세요.
// 출력 결과:배열: ["apple", "banana", "cherry"] 찾는 문자열: "banana" 결과: 배열에 banana이(가) 존재합니다.
//

        public String method8(String[]arr, String target){
        //값이 존재하는지 확인하는 boolean 자료형 변수명 생성
            boolean found = false; //값이 존재하는지 확신할 수 없기 때문에 false 설정

            //존재하는지 확인하기 위한 여정
            for (String str : arr){
                if(str.equals(target)) {
                    found = true;
                    break;
                }
            }
            //존재 유무를 모두 확인
            if(found) {
                return "배열에"+target+"이 존재합니다.";
            } else {
                return "배열에"+target+"가 존재하지 않습니다.";
            }

        }

//9. 반지름을 입력받아 원의 넓이 반환
//(반지름을 입력받아 원의 넓이를 구하는 공식:  Math.PI * radius * radius)
//문제: 원의 반지름을 입력받아 원의 넓이를 계산하여 출력하세요.
// 출력 결과: 반지름: 7 원의 넓이: 153.93804002589985

        public String method9(double radius,double area){
        double round = Math.PI * radius * radius;
        return "반지름" + radius +"원의넓이 : " +round;
        }


    }





















