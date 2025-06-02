package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car(); //기본 생성자 호출.
        myCar.company = "기아";
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        myCar.speed = 20;
        System.out.println("현재속도 : " + myCar.speed);
    }
}
