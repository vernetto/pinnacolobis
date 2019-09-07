package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManoDiCarte {
    List<Card> cards = new ArrayList<>();

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

    public List<List<Card>> findAllTrisOrPoker() {
        List<List<Card>> result = new ArrayList<>();
        List<Card> sortedList = new ArrayList(cards);
        sortedList.sort(Comparator.comparing(Card::getCv));
        Map<CardValues, List<Card>> map = sortedList.stream().collect(Collectors.groupingBy(Card::getCv));
        for (List<Card> list : map.values()) {
            if (list.size() >= 3) {
                result.add(list);
            }
        }
        return result;
    }


}
