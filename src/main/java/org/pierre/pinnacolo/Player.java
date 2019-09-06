package org.pierre.pinnacolo;

public class Player {
    final String email;
    final int id;
    ManoDiCarte manoDiCarte = new ManoDiCarte();

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public ManoDiCarte getManoDiCarte() {
        return manoDiCarte;
    }

    public Player(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public void setManoDiCarte(ManoDiCarte manoDiCarte) {
        this.manoDiCarte = manoDiCarte;
    }
}
