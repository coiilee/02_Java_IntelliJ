package com.kh.pack1.practice;

import com.kh.pack1.practice.Employee;

public class EmployeeRun {
    public static void main(String[] args) {
        //파라미터 생성자에 모든 값을 넣고 저장.
        Employee employee = new Employee(100,"홍길동","영업부","과장",25,'남',2500000,0.05,"010-1234-5678","서울시 강남구");

        Employee employee1 = new Employee();
        employee1.setEmpNo(100);
        employee1.setEmpName("홍길동");
        employee1.setDept("영업부");
        employee1.setJob("과장");
        employee1.setAge(25);
        employee1.setGender('남');
        employee1.setSalary(2500000);
        employee1.setBonusPoint(0.05);
        employee1.setPhone("010-1234-5678");
        employee1.setAddress("서울시 강남구");

        System.out.println(employee.getEmpNo());
        System.out.println(employee1.getEmpName());


    }
}