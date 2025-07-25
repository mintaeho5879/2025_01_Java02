package control.ioc;

import control.*;

public class TvFactory {
    // 싱글톤으로 만들어주세요.
    private TvFactory() {}
    private static TvFactory tvFactory =null;
    // 객체 생성없이 메소드 호출할 수 있는것은 static밖에 없다.
    public static TvFactory getInstance() {
        if(tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }
    public Tv factory(String speakerName, String wooferName){
        //삼성 Tv 객체화 하려면 뭐가 필요함? 스피커의 주소값 필요.
        // 스피커가 객체화 하려면 뭐가 필요함? 우퍼의 주소값 필요.
        Woofer woofer = switch (wooferName) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };
        return new SamsungTv(speaker);
    }

}
