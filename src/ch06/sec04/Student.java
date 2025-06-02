package ch06.sec04;

public class Student {
    String name; //클래스 안에서 선언된 것. 전역변수

    public Student() {}
    void introduce() {
        System.out.printf("안녕 내 이름은 %s이라고 해\n", this.name);
        int num; //메소드 안에서 선언된 것. 지역변수
    }
}
