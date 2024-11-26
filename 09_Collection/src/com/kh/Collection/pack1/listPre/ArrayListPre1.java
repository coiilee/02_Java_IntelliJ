package com.kh.Collection.pack1.listPre;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPre1 {

    public void snacks(){

        ArrayList<String> snack = new ArrayList<String>();
        snack.add("새우깡");
        snack.add("맛동산");
        snack.add("포카칩");
        snack.add("고구마칩");
        snack.add("고래밥");

        System.out.println(snack);
        System.out.println("총 과자 개수는 : "+snack.size());

        // 2. 만약에 index1 자리에 허니버터칩을 넣고 싶다면, add(index자리넘버, 넣고자 하는 값)
        snack.add(1,"허니버터칩");
        System.out.println("snack 에서 허니버터칩 추가 확인 : " +snack);
        //3. 특정 위치의 값 가져오기 get(int index 자리넘버)
        System.out.println("3번째 인덱스에 저장된 값 : "+snack.get(3));

        //4. 2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 변경할 값)
        snack.set(2,"망고과자");
        System.out.println("망고과자로 변경됐는지 확인 :" +snack);

        //5. 특정 위치의 값을 삭제 remove("삭제할 값") or remove(index자리값)
        snack.remove(1);
        System.out.println("인덱스1번 자리 값 삭제 확인 : " +snack);

        snack.remove("포카칩");
        System.out.println("포카칩이 무사히 사라졌는지 확인 : "+snack);

        //6. contains("값") or contains(index자리값) 리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존재하나요? : "+snack.contains("망고과자"));
    //    System.out.println("망고과자가 존재하나요? : "+snack.contains(1));

        //7. clear(); list안에 들어있는 모든 값 삭제 (list.isEmpty());
        snack.clear();
        System.out.println("list안에 값이 깨끗하게 지워졌나요 ? : " +snack.isEmpty());

        //contains, isEmpty는 값이 boolean 값으로 나옴 !!!!!!
    }

    /*
    * method2 과일을 저장하고 수정하고 삭제하고 비우고
    * 무사히 비웠는지 확인하는 기능 만들어주자
    * */

    public void method2(){

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("사과");
        fruit.add("포도");
        fruit.add("바나나");
        fruit.add("망고");
        System.out.println(fruit);
        System.out.println(fruit.size());

        fruit.add(1, "오렌지");
        System.out.println("인덱스2번에 오렌지 추가됐는지 확인 : "+fruit);

        fruit.set(3,"파인애플");
        System.out.println("바나나를 파인애플로 변경 확인 : "+fruit);

        fruit.remove(0);
        System.out.println("사과 삭제 확인"+fruit);

        fruit.remove("망고");
        System.out.println("망고가 삭제됐는지 확인 : " +fruit);



        if(fruit.contains("사과")){
            fruit.remove("사과");
            fruit.remove("사과를 삭제한 리스트 : "+fruit);
        } else {
            System.out.println("사과가 리스트에 없습니다."+fruit);
        }

        fruit.clear();
        System.out.println("리스트가 비어졌는지 확인 : "+fruit.isEmpty());

    }

    /*method3는 기본타입으로 자료형 제한해서 저장하기*/
    public void method3(){
        //1. 정수(int)타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("IntList : "+intList);

        //2. 문자(char)타입 제한
        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add('가');
        characterList.add('a');
        characterList.add('B');
        characterList.add('나');
        System.out.println("CharacterList : "+characterList);

        //3. 논리 타입으로 제한을 두고 true, false 리스트에 저장
        ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
        booleanList.add(true);
        booleanList.add(false);
        System.out.println("BooleanList : "+booleanList);

        //4. 실수 (double) 타입 제한 doubleList / 1.5 3.24 저장하기
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(3.14);
        System.out.println("DoubleList : " + doubleList);

        //5. float

        //6. long
        //7. short
        //8. byte

    }
}














