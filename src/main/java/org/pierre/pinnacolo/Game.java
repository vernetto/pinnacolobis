package org.pierre.pinnacolo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Game {
    public static final int CARDS_PER_PLAYER = 15;
    public static final int NUMBER_OF_MAZZI = 3;

    @Autowired
    DeckManager deckManager;

    List<Team> teamList = new ArrayList<>();
    Players players = new Players();
    Player currentPlayer ;

    Deck deck;
    Deck scartate = new Deck();

    /**
     * initialize a game with all team members
     * @param strings
     */
    public void init(String[][] strings) {
        int index = 0;
        for (String[] playerString : strings) {
            Team team = new Team();
            for (String teamMember : playerString) {
                Player player = new Player(teamMember, index++);
                team.addPlayer(player);
                players.add(player);
                if (currentPlayer == null) currentPlayer = player;
            }
            teamList.add(team);
        }
        Deck deck = deckManager.createShuffled(NUMBER_OF_MAZZI);
        this.setDeck(deck);
        players.getPlayers().forEach(player -> player.setManoDiCarte(deck.createManoDiCarte(CARDS_PER_PLAYER)));
        scartate.add(deck.pop());
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setScartate(Deck scartate) {
        this.scartate = scartate;
    }

    public List<Player> getAllPlayers() {
        return players.getPlayers();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public Deck getScartate() {
        return this.scartate;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public List<Move> suggestMoves() {
        getCurrentPlayer().getManoDiCarte().findAllTrisOrPoker();
        return null;
    }
}
