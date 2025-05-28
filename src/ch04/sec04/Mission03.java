package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
         // 3~ 8 랜덤값 생성
        int star = (int)(Math.random() * 6.0) + 3;
        System.out.println(star);
        System.out.println("star: " + star);
        for(int i = 0; i<star; i++) {
            System.out.println();  // B
            for(int k = 0; k<star; k++) {
                System.out.print("*"); // A
            }
        }
    }
    //star :6
    // ******
    // ******
    // ******
    // ******
    // ******
    // ******


    }