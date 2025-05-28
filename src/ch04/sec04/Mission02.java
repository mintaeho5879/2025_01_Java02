package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // for 문을 활용하여 위처럼 출력되게 해주세요.
        for(int i = 2; i<11; i++) {
            System.out.print(i - 1 + ", ");
        }
             System.out.println(10);

            System.out.println("---------------");
        for(int j = 1; j<11; j++) {
            if(j>1) {
                System.out.print(", ");
            }
                System.out.print(j);
            }
        }
    }

