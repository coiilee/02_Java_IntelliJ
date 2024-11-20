package com.kh.ex;

import java.util.Scanner;
public class ArrayEx {
    //필드
    Scanner sc = new Scanner(System.in);

    /**
     * 배열 (자료구조)
     *
     * -JAVA에서의 배열
     * -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
     *
     * -생성된 배열의 요소는 index를 이용해서 구분
     *
     * -생성된 배열을 활용하기 위해선,
     *  배열을 참조하는 "참조형 변수"를 이욯.
     *
     *  [참조형 변수]
     *  -주소를 저장하는 변수
     *
     *  -변수 사용시 저장된 주소로 찾아가서 그곳에 위치한 배열, 객체를 참조.
     *  -
     *  -기본 자료형 8개를 제외한 나머지는 모두 참조형 변수임.
     *  * 기본 자료형 = byte, int, short, long, char, boolean, double, float
     *
     *  대표적인 참조 자료형 = String, Scanner , ... 이 외 우리가 만든 자료형이 될 수 있음.
     *
     *  자료형이 맨 앞글자가 소문자로 시작 = 기본자료형
     *                    대문자로 시작 = 참조자료형
     *
     *
     * */
    /**
     * 동일한 타입
     * 자바 배열은 int면 전부 int, String이면 모두다 String, char이면 모두다 char가 되어야함
     * */
    /*
     * 배열 선언, 할당, 초기화
     * */
    public void method1(){
        //변수 선언
        int num; //Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고 ,
                 //변수의 이름을 "num"으로 지정
                 //배열 선언
        int[]arr;
        //Stack 영역에 int[]자료형을 참조할 변수를 선언하고, (주소저장)
        //그 변수의 이름을 "arr"로 지정. arr= array 의 줄임말

        arr= new int[4];
        //Heap 영역에 int 10개짜리 배열을 할당한 후
        //생성된 배열의 주소를 arr 변수에 대입
        //arr 을 이용해서 배열을 참조할 수 있음

        //1)초기화 전->0이 대입되어 있는지 확인
        System.out.println("초기화 전");

        //*bug : 프로그램 수행 중 발생하는 오류(==error)
        //*debug : 프로그램 수행 중 특정 시점에 어떤값을 지니고 있는지 확인하는 것
        //            -> 코드 상태, 오류를 분석할 수 있음

        //2)인덱스를 이용한 초기화
        arr[0]=100;
        arr[1]=200;
        arr[2]=3000;
        arr[3]=5;


        System.out.println("초기화 후");
        /*
        배열은 JS와 마찬가지로
        index= 0번부터 시작해서, 각 값의 자리번호를 매김하는 기능.
        length= 1번부터 시작해서, 총 길이를 표현하는 기능.

        초기화 전
        arr = new[4];
        [Stack]                              [Heap]
        +------------+                +--------------------+
        |  arr(주소)  |   ------->     |  [0] [1] [2] [3]   |
        +------------+                |   0   0   0   0    |
                                      +--------------------+

        초기화 후
        arr[0]=100; arr[1]=200; arr[2]=3000; arr[3]=5;
        값들을 넣어 초기화 한 상태
        [Stack]                              [Heap]
        +------------+                +--------------------+
        |  arr(주소)  |   ------->     |  [0] [1] [2] [3]   |
        +------------+                |  100 200 3000 5    |
                                      +--------------------+

      초기화 전
      int[] arr; 실행 시 :
                Stack에 arr 변수 생성(현재는 주소가 없는 상태);

      arr= new int[4] 실행 시
                - Heap 크기 4짜리 배열이 생성되고 초기값은 0으로 설정
                - Heap에 생선된 배열의 시작 주소가 Stack의 arr에 저장됨
                이제 arr은 Heap의 배열을 참조할 수 있게 되는 것임.
        결과적으로
            Stack : arr변수는 Heap 배열의 주소를 가짐
            Heap : 배열이 생성되어 초기화된 상태

            arr[0]=100; arr[1]=200; arr[2]=3000; arr[3]=5; 값을 넣었을 때 ,
             -Heap에 있는 배열의 각 인덱스에 지정된 값을 저장
             Stack : arr 변수에는 Heap에 있는 배열의 주소값이 저장됨
             Heap : 주소가 가리키는 배열이 각 인덱스에 할당된 값을 포함.

        * */
    }
    
    public void method2(){
        int x = 10; //stack에 저장
        int[] arr = new int[3];//heap 에 저장 
        arr[0]=100; //Heap 공간 첫번째 칸에 100 저장 
        /*
        * Stack : 메모장 
        * 간단히 메모하고 지우는 공간 
        * 프로그램이 끝나면 메모지도 자동으로 치워짐 
        * 
        * Heap : 창고 
        * 큰 물건을 저장하고, 필요할 때 주소를 이용해 꺼내씀 
        * 창고에 저장된 물건을 직접 정리를 해야 나중에 데이터가 어디 있는지 알고 찾을 수 있음
        * */
    }


    /*
    * 정수 4개를 입력받아
    * 배열에 차례대로 대입 후
    * 결과를 확인
    * */
    public void method3(){
        //배열 선언 + 할당
        //int arr = new int[4]; -> java에게 값을 담을 공간이 배열 형태( [] )임을 미리 알려주지 않으면 에러발생
        //반드시 int 나 변수명 앞 뒤에 []를 붙여줘야함
        //단 int와 같은 자료형 앞은 붙이기 x
        /*
        기본자료형에 []붙었기 때문에 참조형 변수가 됨 
        * int arr = new int[4]; (x)  
        * []int arr = new int[4]; (x)
        * int[] arr = new int[4]; (o)
        * int []arr = new int[4]; (o)
        * int arr[] = new int[4]; (o)
        배열이름.length : 배열 길이 
        * */
        
        
        //for문을 이용해 i=0,1,2,3 확인 
        int arr[]=new int[4];
        for (int i=0; i<arr.length; i++){
            System.out.println(i+"번째 인덱스 위치");
        }
    }

    //배열 역순 출력
     public void method4(){
        int[] arr= {4,6,7,3,9};

        System.out.print("배열 역순 출력 :");
        //length-1 : index 4번부터 0번까지만 출력
        for (int i=arr.length -1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr);
        //출력시, [I@56f4468b 와같은 주소 값 보임
         //[배열시작 뜻 I정수형이라는 의미 @뒤는
        System.out.println("arr 0번째 값"+arr[0]);
        System.out.println("arr 1번째 값"+arr[1]);
        System.out.println("arr 2번째 값"+arr[2]);
        System.out.println("arr 3번째 값"+arr[3]);
        System.out.println("arr 4번째 값"+arr[4]);
       // System.out.println("arr 5번째 값"+arr[5]);
         //Index 5 out of bounds for length 5
         //index값이 0~4까지니까 없는 자리를 찾는다는 에러 발생함.


     }

     //문자열 배열 출력
    public void method5(){
        String[]days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
        //요일들 모두 for문을 이용해 출력하기
        for (int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
    }
}















