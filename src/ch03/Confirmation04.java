package ch03;

public class Confirmation04 {
    public static void main(String[] args) {
        int value = 356;

        System.out.println((int)(value*0.01)  * 100);
        System.out.println(value / 100 * 100);
        System.out.println(value - value%100);
    }
}
