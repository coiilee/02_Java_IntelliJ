package com.kh.Collection.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapService {

    //1. HashMap 을 이용해서 값 추가하고 확인하기
    public void method1(){
        HashMap<String,String>나라들 = new HashMap<String,String>();

        //데이터 추가
        나라들.put(" KR", "Korea");
        나라들.put("KR ", "Korea");
        나라들.put("KR", "Korea ");
        나라들.put("US", "United States");
        나라들.put("EU", "Europe");

        System.out.println("각 국가들의 약칭 확인하기 : "+ 나라들);
        //각 국가들의 약칭 확인하기 : {EU=Europe, KR=Korea, US=United States}
        //우리가 작성한 순서와 관계없이 나열됨.
        //Key 스페이스바 추가하면 스페이스바로 넣은 띄어쓰기 또한 하나의 글자로 인식함
        //마치 중복돼서 출력 되는것처럼 보임
        //KR=Korea가 네번 보여질 것.

        //2. key에 해당되는 Value 반환
        System.out.println("----------------------------");
        System.out.println(나라들.get("EU")); //존재하는 키의 값을 보여주고 (Europe)
        System.out.println(나라들.get("CN")); //존재하지 않는 키는 null 값을 출력함.

        //3. size() 이용해서 Map에 저장된 Entry(K:V)의 개수 출력. size는 int값으로 나옴
        System.out.println("저장된 나라종류 수 : " +나라들.size());

        //4. V remove(K k) : Key가 일치하는 Entry 제거하기 (K : V)
        //일치하는 키가 있다면 value, 없다면 null반환
        나라들.remove("KR");
        나라들.remove("EU ");
        System.out.println("제거 후 나라들 출력"+ 나라들);

        //만약 지우는 광경으 확인하기 바란다면 remove를 출력문 안에 작성해주면 됨
        System.out.println("[EU] 지우기 : "+나라들.remove("EU "));

        //5. clear() : 모든 Entry 삭제
        //6. boolean is Empty() : 비어있는지 확인
        System.out.println("clear()로 모두 지우기 전에 안에 값이 들어있는지 확인 : "+나라들.isEmpty());
        나라들.clear();
        System.out.println("clear()로 모두 지운 다음 안에 값이 들어있는지 확인 : "+나라들.isEmpty());
    }

    //2. 향상된 for문을 이용해서 순차적으로 접근해서 출력하기
    //2-1. Map의 경우에도 index가 없기 때문에 Map.keyset()을 이용해서 접근
    public void method2(){
        Map<String,String>map = new HashMap<String,String>();
        map.put("학원","서울시 강남구");
        map.put("집","서울시 동작구");
        map.put("63빌딩","서울시 영등포구");
        map.put("롯데타워","서울시 송파구");

        //Set<k>Map.keyset():-> Map에서 key만 가져온 다음 Set 형태로 만들어 반환
        Set<String>set = map.keySet();

        System.out.println("keyset() 확인하기 : "+set);

        //향상된 for문 + set
        for(String key : set){
            System.out.println(key+" : "+map.get(key));
        }
    }

    //2-2. Map의 경우에도 index가 없기 때문에 Map.entryset()을 이용해서 접근
    public void method3(){
        HashMap<String,String>map = new HashMap<String,String>();
        map.put("학원","서울시 강남구");
        map.put("집","서울시 동작구");
        map.put("63빌딩","서울시 영등포구");
        map.put("롯데타워","서울시 송파구");

        Set<Map.Entry<String,String>> entryset = map.entrySet();

        System.out.println("entryset() 확인하기 : "+entryset);
        //set이라고 된 변수명이 Map.Entry<String,String>이라는 키 값 형태로 값을 유지하고 있기 때문에
        //set 리스트에 작성된 목록들을 key라는 변수명으로 하나씩 가져올 때
        //Map.Entry<String,String>이 형태로 가져온다는 표기

        //향상된 for문 + set
        for(Map.Entry<String,String> entry : entryset){
            //key-value 한쌍씩 가져온 값에서 하나씩 출력
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    }






















