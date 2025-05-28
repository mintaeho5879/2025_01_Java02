package ch04.sec04;

public class Mission06 {
    /*
        1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 무엇인지 알아내는 예제
     */
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        while (true) {
            if (sum + (num + 1) > 100) {
                break;
            }
            num++;
            sum += num;
        }
        System.out.println(num);
    }


}
