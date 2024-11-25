package com.kh.poly.pack2.maver;

public class 메이버카페 extends 메이버회원 {

    //카페권한
    //가입카페명
    private String cafeMember;
    private String cafeName;

    public 메이버카페(){
        super();
    }

    public 메이버카페(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String cafeMember, String cafeName) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.cafeMember = cafeMember;
        this.cafeName = cafeName;
    }

    public void setCafeMember(String cafeMember) {
        this.cafeMember = cafeMember;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getCafeMember() {
        return cafeMember;
    }

    public String getCafeName() {
        return cafeName;
    }

    //  '\'' 작은 따옴표 출력
    @Override
    public String toString() {
        return "메이버카페{" +
              super.toString() +'\''+
                "cafeMember='" + cafeMember + '\'' +
                ", cafeName='" + cafeName + '\'' +
                '}';
    }

}


