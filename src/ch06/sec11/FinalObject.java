package ch06.sec11;

public class FinalObject {
    // 상수는 멤버필드는 반드시 초기화를 해야한다.
    private final String name= "홍길동";

    //그러나 !! 생성자로 값을 넣는다 내용이 있을경우 선언만 가능하다.
    private final int AGE;

    public FinalObject(int age) {
        this.AGE = age;
    }
    public void myAge() {
        System.out.println("age: " + this.AGE);
    }
}
