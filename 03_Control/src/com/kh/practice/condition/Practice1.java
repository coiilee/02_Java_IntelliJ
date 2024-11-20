package com.kh.practice;

import java.util.Scanner;

public class Practice1 {
        Scanner sc = new Scanner(System.in);

    public void method1() {

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요: ");

        int choice = sc.nextInt();
        String result = "";

        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                result = "잘못된 번호";
                break;
        }

        System.out.println(result + " 메뉴 입니다.");
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("홀/짝 맞추기 정수를 입력하세요.");
        int choice = sc.nextInt();

        if (choice == 0) {
            if (choice % 2 == 0) {
                System.out.println("짝수 입니다.");

            } else {
                System.out.println("홀수 입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다.");
        }
    }

    public void method5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String pw = sc.nextLine();

        if (id.equals("myId") && pw.equals("myPassword12")) {
            System.out.println("로그인 성공");
        } else if (!id.equals("myId")) {
            System.out.println("아이디가 틀렸습니다.");
        } else if (!pw.equals("myPassword12")) {
            System.out.println("비밀번호가 틀렸습니다.");
        }else {
            System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
        }

//            if (id == "myId" && pw == "myPassword12") {
//                System.out.println("로그인 성공");
//            } else if (id != "myId") {
//                System.out.println("아이디가 틀렸습니다.");
//            } else if (pw != "myPassword12") {
//                System.out.println("비밀번호가 틀렸습니다.");
//            } else {
//                System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
//            }
    }
    
    
    /*
    * if문으로 되어있는 봄,여름,가을,겨울을 switch 문으로 바꿔출력하기 
    * */
    public void method4() {
        //1~12 사이의 정수 입력받기 
        System.out.print("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt(); //사용자가 입력한 월
        //switch 이용해 계절 출력 
        switch (month) {
            case 1: case 2: case 12: 
                System.out.println(month+"월은 겨울입니다.");
                break;
                case 3:  case 4: case 5:
                System.out.println(month+"월은 봄입니다.");
                break;
                    case 6: case 7: case 8:
                System.out.println(month+"월은 여름입니다.");
                break;
                        case 9: case 10: case 11:
                System.out.println(month+"월은 가을입니다.");
                break;
                            default:
                                System.out.println(month+"월은 잘못 입력된 달입니다.");

        }
        
    }

    public void method10() {
        while(true) {
            System.out.println("*****실행할 기능을 선택하세요.*****");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt(); //사용자가 번호를 선택하도록 입력하는 공간 작성
            //선택한 번호에 따른 기능 실행
            switch (choice) {
                case 1:
                    method1(); //public void method1() 작성된 코드가 호출됨
                    //외부에서 기능을 특정적으로 실행하지 않을 때는
                    //내부에서만 기능 불러오기를 진행할 때 기능명칭()만 작성해주면 됨
                    //단 main()는 예외적으로 클래스파일명 변수명 = new 클래스파일명(); 작성 후 기능 불러오기 가능
                    break;
                    case 2:
                        method2();
                        break;
                            case 4:
                                method4();
                                break;
                        case 5:
                            method5();
                            break;
                                case 3: case 6: case 7: case 8: case 9:
                                    System.out.println("기능 준비중입니다.");
                                    break;
                case 0 : System.out.print("프로그램을 종료합니다.");
                //while옆에 true로 적힌 부분을 변수 isTrue에 담아서
                    //추후에 isTrue = false로 표현해서 종료하게 만들기
                    break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                        break;
            }
        }
    }
}




















