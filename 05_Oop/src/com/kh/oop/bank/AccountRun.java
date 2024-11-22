package com.kh.oop.bank;

public class AccountRun {
    public static void main(String[] args) {
        Account acc = new Account();

        //set을 이용해 간접 접근하기
        acc.setName("동그라미"); //예금주설정
        acc.setAccountNumber("1234-56-789"); //계좌설정
        acc.setBalance(100); //잔액설정
        acc.setPassword("1234"); //비번설정

        //이름이랑 계좌번호가 무사히 들어갔는지 확인하기
        //확인하기 위해서 1. getNAme(), getAccountNumber()
        //호출해서 저장된 값들 확인 = System 출력문을 통해서
        System.out.println(acc.getName());
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
        System.out.println(acc.getPassword());

        System.out.println("=====계좌에 입금을 시작합니다.=====");
        //계좌에 입금하기
        acc.deposit(1234);
        acc.deposit(120000);

        System.out.println("=====계좌에 출금을 시작합니다.=====");
        acc.withdraw(122);
        acc.withdraw(1000000);
    }
}
