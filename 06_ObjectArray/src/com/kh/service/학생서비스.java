package com.kh.service;


//Service 클래스 : 기능제공 클래스
// -> 입력, 출력 빼고 나머지 모두 작성하는 곳

//if for 문을 이용해 데이터를 가공하고 저장함
//run에서 작성했던 사람을 저장하고 추가하고 삭제하고 수정하는 추가 기능을
//서비스라는 폴더로 따로 빼서 작성
//한마디로 기능모음 폴더.

import com.kh.dto.학생;

public class 학생서비스 {
    private 학생 s1; // dto에 만든 학생을 참조자료형으로 사용해서 학생에 등록된 정보를 저장하기 위함.

    //학생 정보 추가
    public void 학생추가하기(String studentNumber, String studentName, char studentGender) {
        s1 = new 학생(studentNumber, studentName, studentGender);
    }

    //학생 정보 반환
    public 학생 getS1() {
        return s1;
    }
}
