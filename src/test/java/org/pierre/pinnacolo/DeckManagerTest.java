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
    Game game ;

    @Test
    void createShuffled() {
        game.init(new String[][] { {"mamma@gmail.com", "gabri@gmail.com"}, {"elena@gmail.com", "carmen@gmail.com"}});
        Deck deck = game.getDeck();
        assertTrue(deck.size() == 3 * 52 - 4 * 15);
        game.getAllPlayers().forEach(player -> assertTrue(player.getManoDiCarte().size() == 15));
    }

}