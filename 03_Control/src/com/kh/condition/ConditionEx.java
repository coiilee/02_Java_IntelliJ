package com.kh.condition;

import java.util.Scanner;
/*조건문 기능용 클래스*/
public class ConditionEx {
    /// main 기능이 없기 때문에 아무리 Ctrl + Shift + f10으로 실행해도
    /// 실행한다는 표기(public static void main)가 없기 때문에 실행이 안되는 공간임.
    public void 나이확인(){
        Scanner sc = new Scanner(System.in);

        System.out.println("******나이를 확인하기 ******");

        int age = 20;
        if (age < 18) {
            System.out.println("성인이 아닙니다. ");
        } else {
            System.out.println("성인입니다.");
        }
    }


        public void scannerAge(){
            Scanner sc = new Scanner(System.in);
            System.out.print("나이로 성인인지 판단하기. : ");
            System.out.print("나이를 입력해주세요. : ");
            int age = sc.nextInt();

            //입력 받은 나이가 19세 이상이라면
            if(age>=19) {
                System.out.println("성인입니다.");
            } else {
                System.out.println("성인이 아닙니다. ");
            }
        }

        public void methodAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("**세분화된 나이 판단 기능 ***");
        System.out.print("나이를 입력해주세요: ");
            int age = sc.nextInt();
        
        if (age<=13) {
            System.out.println("어린이입니다. ");
        } else if(age<18) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다. ");
         }
        }

       
        
        public void methodMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("계절 확인이 필요한 월을 입력해주세요. ");
        System.out.println("숫자만 입력이 가능합니다.");
        System.out.println("계절 확인하고자 하는 월(달) 입력하기.");
        int month = sc.nextInt();
            String season;
            
        if (month <1 || month >12) {
            System.out.println("1~12만 가능");
                    return;
        }else if (month>=3 && month<=5) {
            season = "봄";
        } else if (month>=6 && month<=8) {
            season = "여름";
            } else if (month>=9 && month<=11) {
            season = "가을";
            } else {
            season = "겨울";
            }
        System.out.println(month+" 는"+season+"입니다.");

        }
        public void switchMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("달(월)입력 : ");
        int m = sc.nextInt();
        String season;
        
        switch (m){
            case 1:case 2:case 12: 
                season="겨울";
                break;
                case 3:case 4:case 5:
                    season="봄";
                    break;
            case 6:case 7:case 8:
                season="여름";
                break;
            case 9:case 10:case 11:
                season="가을";
                break;
                default:
                    season="잘못입력";
                    break;
                
        }
        System.out.println(m + "월은" + season + "입니다.");
        }
    }

