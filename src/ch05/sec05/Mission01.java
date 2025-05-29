package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    /*
    주민번호를 입력하시오 (xxxxxx-xxxxxxx)>
    (만약) 주민등록번호길이가 다르면 "잘못입력 하셨습니다.
    (길이가 맞다면) 8번째 자리의 값으로 "여성", "남성" 출력해주세요.
    (8번째자리가 1~4가 아니라면) "잘못입력하셨습니다."
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하시오(xxxxxx-xxxxxxx)>");
        String ssn = scanner.next();
        if(ssn.length() != 14) {
            System.out.println("잘못 입력하셨습니다.");
        } else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='3') {
            System.out.println("남성");
        } else if(ssn.charAt(7)=='2'||ssn.charAt(7)=='4') {
            System.out.println("여성");
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }
    }
}
