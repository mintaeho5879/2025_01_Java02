package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        System.out.println("seanson[0]: " + season[0]);
        System.out.println("seanson[1]: " + season[1]);

        season[0] = "봄";
        System.out.println("seanson[0]: " + season[0]);
        System.out.println("--------------------");
        int[] scores = { 83, 90, 87 };

        int sum = 0;

//        for(int i = 0; i<scores.length; i++) {
//            sum += scores[i];
//        }
        // 향상된 포문, 읽기만 할때 굉장이 편리함.
        for(int item : scores) {
            sum += item;
        }
        //총합
        System.out.println("sum : " + sum);

        //평균
        double avg = (double)sum/scores.length;
        System.out.println("avg : " + avg);
        System.out.printf("avg : %.2f\n",avg);
    }
}
