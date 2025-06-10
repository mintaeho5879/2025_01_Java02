package ch06.sec08.exam04;


public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 40인 정사각형의 넓이를 구하고 싶소.
        Calculator cal = new Calculator();
        double result1 = cal.areaRectangle(40);
        System.out.println("result1: " + result1);

        // 가로 40, 세로 50인 직사각형의 넓이를 구하고 싶소.
        double result2 = cal.areaRectangle(40,50);
        System.out.println("result2: " + result2);
    }
}
