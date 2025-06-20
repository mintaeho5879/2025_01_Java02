package control;
//인터페이스는 추상메소드 밖에 못가져서 추상메소드는 상속을 해야하는데
// 상속받은애는 추상메소드를 구현을 해줘야하는데, 그러려면 오버라이딩을 해줘야함
public class MartenWoofer implements Woofer {

    @Override
    public void baseSound() {
        System.out.println("Marten Woofer: 웅~ 웅~ 웅~");
    }
}
