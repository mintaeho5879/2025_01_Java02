package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        // 20 ~ 30 까지 모두 더한 결과값을 출력해주세요.
        // for 문 사용
        int sum = 0;
        for(int i =20; i<31; i++) {
            sum += i;
        }
            System.out.println("sum: " + sum);
    }
}
