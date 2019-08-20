package blackJack;

import java.util.ArrayList;

public class BlackjackHand extends Deck {

    public int getValue() {


        return 21;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }


}
