package org.pierre.pinnacolo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)

class DeckManagerTest {
    @Autowired
    DeckManager deckManager;

    @Test
    void createShuffled() {
        Deck deck = deckManager.createShuffled(3);
        assertTrue(deck.size() == 3 * 52);
        assertTrue(deck.findAll(CardValues.VR, Seeds.CUORI).size() == 3);
        assertTrue(deck.findAll(CardValues.V3, Seeds.FIORI).size() == 3);
    }

    @Test
    void assignCards() {
        Deck deck = deckManager.createShuffled(3);
        Players players = new Players();
        players.add(new Player("mamma@gmail.com", 1));
        players.add(new Player("gabri@gmail.com", 2));
        players.add(new Player("elena@gmail.com", 3));
        players.add(new Player("carmen@gmail.com", 4));
        players.getPlayers().forEach(player -> player.setManoDiCarte(deck.createManoDiCarte(15)));
        assertTrue(deck.size() == 52 * 3 - 15 * 4);
        players.getPlayers().forEach(player -> assertTrue(player.getManoDiCarte().size() == 15));


    }
}