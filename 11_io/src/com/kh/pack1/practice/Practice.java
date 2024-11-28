package com.kh.pack1.practice;

import java.util.ArrayList;

public class Practice {

    int empNo = 100;
    String empName="홍길동";
    String dept= "영업부";
    String job= "과장";
    int age= 25;
    char gender= 'M';
    int salary= 2500000;
    double bonusPoint= 0.05;
    String phone= "010-2356-8954";
    String address= "서울시 강남구";

    public void employee(){
        ArrayList<Practice>p=new ArrayList<Practice>();
        p.add(this);
    }
    public Practice() {
    }

    public Practice(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonusPoint=" + bonusPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}