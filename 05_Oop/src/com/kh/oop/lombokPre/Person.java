package com.kh.oop.lombokPre;
//Alt Shift Enter -> 가져와야되는 경로 있다면 자동추가
/*
lombok을 사용하기 위해 종속성 설정을 진행해줘야함
하지만 현재는 진행 x
* */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  // 기본 생성자 어노테이션
@AllArgsConstructor // 필수 생성자 어노테이션
@Setter             // Setter 어노테이션
@Getter             // Getter 어노테이션
public class Person {
    private String name;
    private int age;

    /*
    import lombok.NoArgsConstructor; -> 롬복 회사에서 만든 기본생성자 기능 가져오기
                 @NoArgsConstructor  -> 기능 가져와서 사용하기
    기본생성자 = 넣어야하는 매개변수가 없기 때문에 No Args Constructor
    () -> 넣어야하는 값이 없기 때문에 매개변수명도 존재하지 않음. 그래서 No Args.
    public Person() {

    * */
    /*
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    */

    /*
    import lombok.AllArgsConstructor; -> 롬복 회사에서 만든 매개변수 생성자 기능 가져오기
                 @AllArgsConstructor;  -> 기능 가져와서 사용하기
   모든 파라미터 값을 넣어야하는 생성자 => 필드에 작성된 모든 값 가져오기
   All Args = 모든 전달인자 값을 가져와서
    public Person() {

    * */



    /*
    * import lombok.Setter;->lombok&#xC774;&#xB77C;&#xB294; &#xD3F4;&#xB354; &#xBC11;&#xC5D0; &#xB9CC;&#xB4E4;&#xC5B4;&#xC9C4; Setter &#xAE30;&#xB2A5;&#xC744; &#xAC00;&#xC838;&#xC640;&#xC11C; &#xC0AC;&#xC6A9;
     @Setter              -> &#xD074;&#xB798;&#xC2A4; &#xBC11;&#xC5D0; &#xC791;&#xC131;&#xB41C; &#xD544;&#xB4DC;&#xBA85;&#xC5D0; &#xAC78;&#xB9DE;&#xB294; get &#xBA54;&#xC11C;&#xB4DC;&#xB4E4;&#xC744; @Setter &#xC774;&#xB984;&#xC744; &#xD65C;&#xC6A9;&#xD574;&#xC11C; &#xB300;&#xC2E0; &#xBAA8;&#xB450; &#xC0DD;&#xC131;

     public void setName(String name, int age){
     this. name = name;
     this. age = age
     }

    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }




    * */

/*
    나중에 홈복이라는 회사를 이용해 @Getter 로만 표기할 것임
    import lombok.Getter;->lombok이라는 폴더 밑에 만들어진 Getter 기능을 가져와서 사용
    @Getter              -> 클래스 밑에 작성된 필드명에 걸맞는 get 메서드들을 @Getter 이름을 활용해서 대신 모두 생성


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

 */
}
