package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {
        //args이용하여 각 방에 있는 값들을 모두 더한 값을 출력
        int sum = 0;
//        for(int i = 0; i < args.length; i++) {
//            sum += Integer.parseInt(args[i]);
//        }
        for(String item : args) {
            int val = Integer.parseInt(item);
            sum += val;
        }
        System.out.println("sum: " + sum);
    }
}
