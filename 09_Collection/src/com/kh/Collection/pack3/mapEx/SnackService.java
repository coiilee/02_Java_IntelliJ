package com.kh.Collection.pack3.mapEx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SnackService {
    //과자 이름과 가격을 추가
    public void method1() {
        HashMap<String, Integer> snackList = new HashMap<String, Integer>();
        snackList.put("구름과자", 2000);
        System.out.println(snackList);
    }
        //method2 점심메뉴 저장 (키 : 메뉴이름 값 : 분류)
        public void method2(){
            HashMap<String,String> menu = new HashMap<>();

            menu.put("김치찌개","한식");
            menu.put("파스타","양식");
            menu.put("짜장면","중식");
            menu.put("스테이크","양식");
            menu.put("비빔밥","한식");

//            Set<Map<String,String>>
            System.out.println("점심 리스트 확인 : "+ menu);

            //파스타 어떤 음식인지 출력 :
            String pastaType = menu.get("파스타");
            System.out.println("파스타 분류 : "+ pastaType);
            // System.out.println("파스타 분류 : " + menu.get("파스타"));

            //목록에서 짜장면 제거하고 containsKey로 확인하기 :
            menu.remove("짜장면");
            System.out.println("짜장면 제거 확인 : " + menu);
            boolean jjajang = menu.containsKey("짜장면");
            System.out.println("짜장면 제거 확인 : " + jjajang);
            //System.out.println(menu.containsKey("짜장면"));

            //스테이크 -> 한식 변경 (put으로 덮어쓰기)
            menu.put("스테이크","한식");
            System.out.println("스테이크가 한식으로 변경됐는지 확인하기 : " + menu);
            //or replace(특정값 변경) 활용하는 방법
            //menu.replace("스테이크","한식"); ---> 위 put에 작성된 스테이크 값을 한식으로 변경할 수 있음.


            // 점심리스트 모두 삭제
            menu.clear();
            System.out.println("모두 삭제 확인 : "+ menu);

            //삭제 확인
            boolean tf = menu.isEmpty();
            System.out.println("모두 삭제 확인 : "+ tf); //isEmpty결과 또한 boolean이기 때문에,
                                                       //자료형 boolean 변수명으로 담아서 사용 가능
        }

    }















