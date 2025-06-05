package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5였다면 ***** (개행)
        // 3였다면 *** (개행)
        printSingleline(star);

        System.out.println("-----------------");

//        printMultiline(4);
        //****
        //****
        //****
        //****
//        printMultiline(6);
        //******
        //******
        //******
        //******
        //******
        //******
        //******
        printMultiline(star);
        System.out.println("==================");
        printTriangleLine(star);
        //*
        //**
        //***
        //****
    }

    public static void printSingleline(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMultiline(int cnt) {
        for (int i = 0; i < cnt; i++) {
            for (int k = 0; k < cnt; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTriangleLine(int cnt) {
        for (int i = 0; i <= cnt; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}