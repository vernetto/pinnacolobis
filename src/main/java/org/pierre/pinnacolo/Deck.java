package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;

public class Deck {
    ConcurrentLinkedDeque<Card> cards = new ConcurrentLinkedDeque<>();
    public void addCard(CardValues cv, Seeds seed) {
        Card card = new Card(cv, seed);
        cards.add(card);

    }

    public int size() {
        return cards.size();
    }

    public List<Card> findAll(CardValues cv, Seeds seed) {
        return cards.stream().filter(card -> card.getCv().equals(cv) && card.getSeed().equals(seed)).collect(Collectors.toList());
    }

    public ManoDiCarte createManoDiCarte(int count) {
        ManoDiCarte manoDiCarte = new ManoDiCarte();
        for (int i  = 0 ; i < count; i++) {
            manoDiCarte.add(cards.pop());
        }
        return manoDiCarte;
    }
}
