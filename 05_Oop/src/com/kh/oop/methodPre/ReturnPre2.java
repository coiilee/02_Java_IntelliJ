package com.kh.oop.methodPre;

import javax.swing.*;

public class ReturnPre2 {

    //1.이름과 나이를 입력받아 소개 메세지 반환
    //안녕하세요! 제 이름은 홍길동이고, 나이는 40세입니다.

    public String name = "홍길동";
    public int age = 40;

    public String introduce(String name, int age) {
        String result = "";
        result = ("안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
        return result;
    }

    //2. 두 숫자를 입력받아 가장 큰 숫자를 반환 Scanner 아님
    //num1, num2 비교해서 큰 값의 숫자를 출력하기

    public int add(int num1, int num2) {
            if (num1> num2) {
                return num1;
            } else if (num2 > num1) {
            return num2;
        }
        return add(num1, num2);
    }

        //3. 입력된 점수에 따라 등급 반환
        //(switch 나 if-else if 활용)
        //문제: 점수를 입력받아 등급을 아래와 같은 형식으로 출력하세요.
        //출력 결과:  입력한 점수: 85 등급: B

    public String xyz(int score){

              if(score>=90){
                  return "A";
        } else if (score>=80){
                  return "B";
              } else if (score>=70){
                  return "C";
              } else {
                  return "D";
    }



//    4. 상품 가격과 할인율을 입력받아 최종 금액 반환
//    (가격 - 가격 * 할인률 / 100)
//    문제: 상품 가격과 할인율을 입력받아 할인된 금액을 계산하여 출력하세요.
//    출력 결과: 원래 가격: 100000원 할인율: 20% 최종 금액: 80000원


    public double ()



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





//7. 두 문자열을 연결한 뒤 반환
//            (문자열 + 로 이어붙이기)
//    문제: 문자열 두 개를 입력받아 연결된 결과를 아래와 같이 출력하세요.
//    출력 결과: 입력된 문자열: "Hello", "World" 연결된 문자열: "Hello World"
//





//8. 특정 문자열이 배열에 존재하는지 확인 후 결과 반환
// (향상된 for문과 if문 조합)
// 문제: 주어진 배열에서 특정 문자열이 존재하는지 확인하고 결과를 출력하세요.
// 출력 결과:배열: ["apple", "banana", "cherry"] 찾는 문자열: "banana" 결과: 배열에 banana이(가) 존재합니다.
//





//9. 반지름을 입력받아 원의 넓이 반환
//(반지름을 입력받아 원의 넓이를 구하는 공식:  Math.PI * radius * radius)
//문제: 원의 반지름을 입력받아 원의 넓이를 계산하여 출력하세요.
// 출력 결과: 반지름: 7 원의 넓이: 153.93804002589985



    }

