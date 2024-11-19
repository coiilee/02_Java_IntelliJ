package Practice;

import java.util.Scanner;

public class practice1 {
        Scanner sc = new Scanner(System.in);
    public void practice1() {

        int num = sc.nextInt();

        if (num >=1){
            System.out.println("양수입니다.");
        } else if(num < 0){
            System.out.println("음수입니다.");
        }


    }

    public void practice2() {
        System.out.print("숫자를 입력하세요.");
        int num = sc.nextInt();
        if (num >=1){
            System.out.println("양수입니다.");
        } else if(num < 0){
            System.out.println("음수입니다.");
        } else if (num == 0){
            System.out.print("0이다.");
        }
    }
    
    public void practice3() {
        System.out.print("숫자를 입력하세요.");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("짝수다.");
        } else {
            System.out.print("홀수다.");
        }
    }

    public void practice4() {
        System.out.print("사탕수 입력 : ");
        int candy = sc.nextInt();
        System.out.print("사람수 입력 : ");
        int human = sc.nextInt();

        int sum = candy/human;
        int rest = candy%human;

        System.out.print("1인당 사탕개수 :"+sum);
        System.out.print("남는사탕 개수 :"+rest);
    }
}

