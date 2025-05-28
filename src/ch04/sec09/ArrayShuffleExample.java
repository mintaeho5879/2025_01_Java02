package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10칸짜리 정수 배열을 만들고 싶다.
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        /*
        0~9 랜덤값 구한다. 예를들어 7이 나왔다. 0번방과 7번방 스와핑한다.
        0~9 랜덤값 구한다. 예를들어 8이 나왔다. 1번방과 8번방 스와핑한다.
        0~9 랜덤값 구한다. 예를들어 5이 나왔다. 2번방과 5번방 스와핑한다.
        */
       int num2 = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            int num = (int)(Math.random() * 10.0);
            num2 = arr[i];
            arr[i] = arr[num];
            arr[num] = num2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
