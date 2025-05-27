package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    /*
    (커맨드창으로 값을 입력받을 것이다.)
    정수를 입력해주세요> 60 (엔터)
    (정수가 60점 이상이면)  " 합격입니다."
    (아니다) "불합격입니다."

    출력되면된다.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요> ");
        //int value = scanner.nextInt();
        String str =scanner.next();
        try {
            int value = Integer.parseInt(str);
            if (value >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
