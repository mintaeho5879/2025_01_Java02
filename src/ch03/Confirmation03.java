package ch03;

public class Confirmation03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        //학생 한명이 가지는 연필수
        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent); // 17

        //남은 연필수
        int pencillsLeft = pencils % students;
        System.out.println(pencillsLeft); // 24
    }
}
