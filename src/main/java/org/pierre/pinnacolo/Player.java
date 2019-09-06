package org.pierre.pinnacolo;

public class Player {
    final String email;
    final int id;
    ManoDiCarte manoDiCarte = new ManoDiCarte();

    public Player(String email, int id) {
        this.email = email;
        this.id = id;
    }

}
