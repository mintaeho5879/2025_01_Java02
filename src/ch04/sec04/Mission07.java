package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60,90 };
        //어떤 학생이 받은 점수이다.
        //평균 점수를 구하라.
        int sum = 0;
        for(int item : scores) {
            sum += item;
        }
          System.out.println("avg: " + (double)sum / scores.length);
    }
}
