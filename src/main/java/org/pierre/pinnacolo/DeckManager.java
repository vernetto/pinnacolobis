package org.pierre.pinnacolo;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DeckManager {

    public Deck createShuffled(int repetitions) {
        Deck deck = new Deck();
        for (int i = 0; i < repetitions; i++ ) {
            Arrays.asList(CardValues.values()).forEach(cv -> addAll(deck, cv));
        }
        return deck;
    }

    private void addAll(Deck deck, CardValues cv) {
        Arrays.asList(Seeds.values()).forEach(seed -> deck.addCard(cv, seed));
    }
}
