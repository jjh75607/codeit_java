package blackJack;

import java.util.ArrayList;

public class BlackjackHand extends Deck {

    public int getValue() {
        int i = 0;
        for (Card card : getCards()) {
            i += new BlackjackCard(card.suitNumber, card.rankNumber).getValue();

            if (i > 21 && card.rankNumber == 1) {
                i -= 10;
            }
        }

        return i;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }


}
