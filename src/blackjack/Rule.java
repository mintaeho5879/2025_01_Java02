package blackjack;

import java.util.List;

public class Rule {
    private final static int MAX_SCORE=21;
    public static void getWinner(Dealer dealer, Gamer gamer) {
        // 경우의 수 6가지
        // 1. 둘 다 총 점수가 21점 초과 >> 비김
        // 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
        // 3. 딜러의 총 점수가 21점 초과 게이머의 총 점수가 21점 이하 >> 게이머 승
        // 4. 둘 다 총 점수가 21점 이하이지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
        // 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
        // 6. 둘 다 총 점수가 21점 이하이지만 딜러의 총 점수가 21점에 가까움 >> 딜러 승
        int dealerScore =Rule.getScore(dealer.openCards());
        int gamerScore =Rule.getScore(gamer.openCards());
        if(dealerScore>MAX_SCORE && gamerScore >MAX_SCORE || dealerScore == gamerScore) {
            System.out.println("Tie");
        } else if( dealerScore <= MAX_SCORE && gamerScore <= MAX_SCORE) {
            System.out.println(dealerScore > gamerScore ? "Dealer Win" : "Gamer Win");
        } else if( dealerScore <= MAX_SCORE) {
            System.out.println("Dealer Win");
        } else {
            System.out.println("Gamer Win");
        }
//        String result ="";
//        if (dealerScore > 21) {
//            if(gamerScore > 21) {
//                result = "draw!";
//            } else {
//                result = "gamer win!";
//            }
//        } else if(dealerScore <= 21) {
//           if(dealerScore == gamerScore) {
//               result = "draw!";
//           } else if (dealerScore > gamerScore) {
//               result = "dealer win!";
//           } else if (dealerScore < gamerScore && gamerScore <= 21) {
//               result = "gamer win!";
//           } else if (gamerScore > 21) {
//               result = "dealer win!";
//           }
//        }
//        System.out.println("result: " + result);
    }
    public static int getScore(List<Card> cards) {
        int score = 0;
        int sum = 0;
            for(int i = 0; i < cards.size(); i++) {
                Card card = cards.get(i);
                sum += convertDenominationToScore(card.getDenomination());

//                switch (card.getDenomination()) {
//                    case "A":
//                        score = 1;
//                        sum += score;
//                    case "J","Q","K":
//                        score = 10;
//                        sum += score;
//                    default:
//                        score = Integer.parseInt(card.getDenomination());
//                        sum += score;
//                }
            }
        return sum;
    }


    private static int convertDenominationToScore(String denomination) {
        return switch (denomination){
            case "A" -> 1;
            case "J","Q","K" ->10;
            default -> Integer.parseInt(denomination);
        };
    }
}
