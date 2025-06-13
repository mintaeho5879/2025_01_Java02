package blackjack;

public class Card {
//무늬 pattern - Spade, Heart, Clover, Diamond
//값 denomination - A,2,3,4,...,9,10,J,Q,K
    private String pattern;
    private String denomination;

    public Card(String pattern,String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern() {
        return pattern;
    }
    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }

    //getters 만든다

    //기본 생성자

    //생성자는 왜 만들어요?

    //생성자, 메소드 차이 다른 2가지.
}
