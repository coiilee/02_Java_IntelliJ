package com.kh.dto;
//DTO : Data Transfer Object (값 전달용 객체)
public class 학생 {
    //필드 인스턴스 변수 (=static이 없기 때문에) 멤버 변수라고도 함.
    private String studentNumber;
    private String studentName;
    private char studentGender;

    //메서드(기본 생성자, 필수 생성자, Setter, Getter, ToString)

    //기본생성자
    public 학생() {
    }

    //필수생성자
    public 학생(String studentNumber, String studentName, char studentGender) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentGender = studentGender;
    }

    //Setter
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentGender(char studentGender) {
        this.studentGender = studentGender;
    }

    //Getter
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getStudentGender() {
        return studentGender;
    }

    //toString
    @Override
    public String toString() {
        return "학생{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentGender=" + studentGender +
                '}';
    }
}
