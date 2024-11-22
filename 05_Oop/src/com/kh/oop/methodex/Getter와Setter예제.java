package com.kh.oop.methodex;

public class Getter와Setter예제 {

    //private 멤버 변수
    private int age; //나이를 받는 변수 설정

    //게터 세터 단축키 Alt + insert

    //세터 : 값 저장 = 추후 @Setter라는 이름으로 요약해서 사용
    public void setAge(int age) {
        /*setter에다가 값을 저장할때 유혀성 검사와 같은 if문은 넣지 않음 */
        this.age = age;
    }
    //게터 : 저장된 값 전달해서 사용 = 추후 @Gettter 라는 이름으로 요약해서 사용
    public int getAge() {
        return age;
    }
}
