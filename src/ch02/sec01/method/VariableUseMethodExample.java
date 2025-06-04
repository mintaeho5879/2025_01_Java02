package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); // 10:20
        printTime(2, 9); // 02:09
        printTime(2, 9, 2); // 02:09:02
        printTime(12, 9, 22); // 12:09:22

    }
    public static void printTime(int hour, int min) {
//        System.out.println((hour < 10 ? "0" + hour:hour)+" : "+(min<10? "0"+min:min));
    String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
    String strMin = min < 10 ? "0" + hour : String.valueOf(min);
        System.out.println(strHour + " : " + strMin);

    }
    public static void printTime(int hour, int min, int sec) {
//        System.out.println((hour < 10 ? "0" + hour:hour)+" : "+(min<10? "0"+min:min)+":"+(sec<10?"0"+sec:sec));
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        String strMin = min < 10 ? "0" + min : String.valueOf(min);
        String strSec = sec < 10 ? "0" + hour : String.valueOf(sec);
        System.out.println(strHour + " : " + strMin + " : " + strSec);

//        System.out.printf("%02d:%02d\n",hour,min);
//        if(hour<10) {
//            System.out.print("0"+hour);
//        } else {
//            System.out.print(hour);
//        }
//        System.out.print(" : ");
//        if(min<10) {
//            System.out.println("0"+min);
//        } else {
//            System.out.println(min);
//        }
//        System.out.println((hour < 10 ? "0" + hour:hour)+" : "+(min<10? "0"+min:min));
        System.out.print(strHour + " : ");
        printTime(min, sec);
    }
}
