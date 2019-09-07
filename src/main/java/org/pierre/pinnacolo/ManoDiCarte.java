package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManoDiCarte {
    public ManoDiCarte(CardCollection cards) {
        this.cards = cards;
    }

    public ManoDiCarte() {
    }

    CardCollection cards = new CardCollection();

    public CardCollection getCards() {
        return cards;
    }

    public void add(Card card) {
        cards.add(card);
    }

    public int size() {
        return cards.size();
    }

    public String toString() {
        return cards.toString();
    }

    public void sort() {
        cards.sort(Comparator.comparing(Card::getSeed).thenComparing(Card::getCv) );
    }

    public List<CardCollection> findAllTrisOrPoker() {
        List<CardCollection> result = new ArrayList<>();
        CardCollection sortedList = new CardCollection(cards);
        sortedList.sort(Comparator.comparing(Card::getCv));
        // TODO for some reason it doesn't return a Map<CardValues, CardCollection> !
        Map<CardValues, List<Card>> map = sortedList.stream().collect(Collectors.groupingBy(Card::getCv));
        for (List<Card> list : map.values()) {
            CardCollection item = new CardCollection(list);
            CardCollection nonDuplicate = item.nonDuplicates();
            if (nonDuplicate.size() >= 3) {
                result.add(item);
            }
        }
        return result;
    }

}
