package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        // 리터럴도 타입이 있다.
        long var1 = 10L;
        long var2 = 20L;
        // long var3 = 1_000_000_000_000; // 컴파일 에러
        long var4 = 1_000_000_000_000L;
        long var5 = 2_147_483_647L;
        long var6 = 2_147_483_648L;


        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
//      System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
        System.out.println("var6 : " + var6);
    }
}
