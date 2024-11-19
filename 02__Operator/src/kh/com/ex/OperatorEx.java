package kh.com.ex;

import java.util.Scanner;

public class OperatorEx {
    public  void 삼의배수기능() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나를 입력하세요 :");
        int a = sc.nextInt();


        /*
        *
        *
        *
        * ! = (Not Equal to, 다름)
        * 부들호를 기준으로 좌 우에 있는 값이 다른 값을 가지는게 맞는지
        *
        * int a = 5;
        * int b = 5;
        * int c = 10;
        *
        * a==b true
        * a==c false
        *
        * a!=c true a와 c의 값이 다르기 때문에 true
        * a==5 false a와 숫자 5으 ㅣ값이 같이 때문에 false
        *
        *
        *
        *
        * */


        boolean tf = a%3 == 0; //3의배수가 맞으면 true 아니면 false
        System.out.print("3의 배수인가 : "+tf);


    }
}
