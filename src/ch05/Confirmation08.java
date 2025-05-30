package ch05;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;

        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            cnt += arr[i].length ;
            for(int k = 0; k < arr[i].length; k++) {
                sum += arr[i][k];
            }
        }
        double avg = (double)sum/cnt;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
