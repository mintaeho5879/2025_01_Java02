package ch04.sec04;

public class Mission04 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; // 2~ 12 랜덤값
        System.out.println("dan: " + dan);
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n",dan,i,dan*i);
        }
    }
}
