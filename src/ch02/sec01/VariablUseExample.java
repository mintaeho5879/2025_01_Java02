package ch02.sec01;

public class VariablUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;

        // hour, min 변수를 활용하여 아래처럼 출력해주세요.

        // 3시간 5분
        //총 185분

        System.out.printf("%d시간 %d분\n", hour,min);
        System.out.printf("총 %d분\n", hour*60+min);
    }
}
