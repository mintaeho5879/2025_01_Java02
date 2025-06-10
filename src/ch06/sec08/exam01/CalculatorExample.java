package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); //기본 생성자
        int result = cal.plus(1, 2);
        System.out.println(result);
        System.out.println("끝");
for(int i = 0 ; i < 2000 ; i++){
    cal.powerOn();
}
        cal.powerOn();
        cal.powerOff();

    }

}
