package ch04.sec04.method;

import java.util.Arrays;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTO(2,6); // [2, 3, 4, 5, 6]
        printNumberFromTO(12,16); // [12, 13, 14, 15, 16]

    }
    public static void printNumberFromTO(int n1, int n2) {
        int arr[] = new int[n2-n1+1];
        for(int i=0; i<arr.length; i++) {
            arr[i] = n1+i;
        }
        System.out.println(Arrays.toString(arr));

        //        System.out.print("[");
//              for(int i = n1; i < n2; i++) {
//              System.out.print(i+", ");
//        }
//
//        System.out.println(n2+"]");
    }
}
