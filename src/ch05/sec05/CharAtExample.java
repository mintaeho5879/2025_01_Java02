package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);

        if (gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if(gender == '2' || gender == '4'){
            System.out.println("여자");
        } else {
            System.out.println("성별이 애매합니다.");
        }
        int intGender = Character.getNumericValue(gender);
        System.out.println(intGender);

//        switch(gender) {
//            case '1','3'
//                : System.out.println("남자");
//                break;
//            case '2','4'
//                :
//                System.out.println("여자");
//                break;
//        }
//        switch(gender) {
//            case '1','3' -> System.out.println("남자");
//            case '2','4' -> System.out.println("여자");
//        }
    }
}
