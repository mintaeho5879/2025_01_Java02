package blackjack;

import java.sql.SQLOutput;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
//        cd.printAllCards();
        Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());

        System.out.println("--------------------");
        cd.printAllCards();

        System.out.println("------- 게이머카드 --------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();

        int score= Rule.getScore(gamer.openCards()); //A:1, 2~10:점수 그대로, J,Q,K: 10점
        System.out.println(score);

        System.out.println("--------딜러 카드---------");
        Dealer dealer = new Dealer();
        dealer. receiveCard(cd.getCard());
        dealer. receiveCard(cd.getCard());
//        dealer.showCards();
//        System.out.println(dealer.needMoreCard());
        if(dealer.needMoreCard()) {
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();
        System.out.println(Rule.getScore(dealer.openCards()));
        Rule.getWinner(dealer, gamer);

    }
}
