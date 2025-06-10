package ch06.sec04;

public class Student {
    String name; //클래스 안에서 선언된 것. 전역변수

    public void Student() {
        System.out.println("기본 생성자 호출!");
    }
    public void introduce() {
        System.out.printf("안녕 내 이름은 %s이라고 해\n", this.name);
        int num; //메소드 안에서 선언된 것. 지역변수
    }
}
