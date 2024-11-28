package com.kh.Collection.pack3.mapEx;

import java.util.HashMap;

public class MapExService {

    public void method1(){
        HashMap<Integer, String> subway = new HashMap<Integer, String>();

        subway.put(1,"에그마요");
        subway.put(2,"로티셰리바베큐");
        subway.put(3,"스테이크앤치즈");
        subway.put(4,"스파이시쉬림프");

        System.out.println("서브웨이 샌드위치 번호와 메뉴명 확인 : " + subway);

    }
}
