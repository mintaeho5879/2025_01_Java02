package ch07.sec02.exam01;

public class PromotionExample {
    public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b; //부모타입은 자식 객체 주소값 담을 수 있다. > 다형성
    A a2 = e;
    E e2 = (E)a2;
//  D d3 = (D)b; //자식타입은 부모 객체 주소값 담을 수 없다. run time Error
//  D d2 = e; // 안된다
    }
}

class A {}
class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}