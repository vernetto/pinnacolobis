package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.List;

public class ManoDiCarte {
    List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public int size() {
        return cards.size();
    }
}
