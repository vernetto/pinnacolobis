package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Player> players = new ArrayList<>();
    CarteMesseGiu carteMesseGiu = new CarteMesseGiu();

    public void addPlayer(Player player) {
        players.add(player);
    }
}
