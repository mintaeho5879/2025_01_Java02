package control.ioc;

import control.Speaker;
import control.Tv;
import control.legacy.JBLSpeaker;

public class SamsungTv implements Tv {
    //삼성Tv는 스피커를 사용할 수 있다.
    //스피커는 HarmanSpeaker를 사용한다.
    private Speaker speaker;

    public SamsungTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv의 소리는요.");
        this.speaker.speakerSound();
    }
}
