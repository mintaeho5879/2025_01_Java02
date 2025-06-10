package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);

        Car car2 = new Car();
        System.out.println("2모델명: " + car.model);
        System.out.println("2시동여부: " + car.start);
        System.out.println("2현재속도: " + car.speed);
    }
}
