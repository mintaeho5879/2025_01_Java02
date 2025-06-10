package ch06.sec07.exam02;

public class Korean {
    String nation;
    String name;
    String ssn;

    public Korean() {
        this("신사임당", "901022-2754312"); //다른 생성자 호출
    }


    // 문자열 3개 저장할 수 있다. 의미부여를 함.
    // 저장할 수 있는 객체를 생성
    public Korean(String name, String ssn) {
        this.nation = "대한민국";
        this.name = name;
        this.ssn = ssn;
    }



}
