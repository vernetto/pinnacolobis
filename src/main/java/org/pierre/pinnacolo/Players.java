package org.pierre.pinnacolo;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private List<Player> players = new ArrayList<>();

    public void add(Player player)  {
        players.add(player);
    }


    public List<Player> getPlayers() {
        return players;
    }
}
