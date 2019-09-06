package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();
    public void addCard(CardValues cv, Seeds seed) {
        Card card = new Card(cv, seed);
        cards.add(card);

    }
}
