package org.pierre.pinnacolo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class DeckManager {

    public Deck createShuffled(int repetitions) {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < repetitions; i++ ) {
            Arrays.asList(CardValues.values()).forEach(cv -> addAll(cards, cv));
        }
        Collections.shuffle(cards);
        cards.forEach(card -> deck.add(card));
        return deck;
    }

    private void addAll(List<Card> cards, CardValues cv) {
        Arrays.asList(Seeds.values()).forEach(seed -> cards.add(new Card(cv, seed)));

    }
}
