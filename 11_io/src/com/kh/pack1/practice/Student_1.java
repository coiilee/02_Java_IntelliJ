package com.kh.pack1.practice;

public class Student_1 {
    //이름 과목 점수
    private String name;
    private String subject;
    private int score;


    public Student_1() {
    }

    public Student_1(String name, String subject, int score) {
        this.score = score;
        this.subject = subject;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }

}
