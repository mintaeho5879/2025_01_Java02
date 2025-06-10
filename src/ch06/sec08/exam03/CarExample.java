package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setGas(10);
        car1.setOil(20);

        int car1Gas = car1.getGas();
        System.out.println("car1Gas: "  + car1Gas);

        int car1Oil = car1.getOil();
        System.out.println("car1Oil: " + car1Oil);

        System.out.println("---------------------");
        Car car2 = new Car(30,40); //gas=30, oil=40;
        Car car3 = new Car(140,150);
        System.out.println(car2.getGas());//30
        System.out.println(car2.getOil());//40
        System.out.println(car3.getGas());//40
        System.out.println(car3.getOil());//40
    }
}
