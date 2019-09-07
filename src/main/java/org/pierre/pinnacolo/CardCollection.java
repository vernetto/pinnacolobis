package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

public class CardCollection extends ArrayList<Card> {

    public CardCollection(CardCollection cards) {
        this.addAll(cards);
    }

    public CardCollection(List<Card> list) {
        this.addAll(list);
    }

    public CardCollection() {

    }

    public CardCollection nonDuplicates() {
        CardCollection result = new CardCollection();
        for (Card item : this) {
            if (!result.find(item)) {
                result.add(item);
            }
        }
        return result;
    }

    private boolean find(Card item) {
        boolean result = false;
        for (Card index : this) {
            if (index.getCv().equals(item.getCv()) && index.getSeed().equals(item.getSeed())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
