package org.pierre.pinnacolo;

public class Player {

    public Player(String email, int id, ManoDiCarte manoDiCarte) {
        this.email = email;
        this.id = id;
        this.manoDiCarte = manoDiCarte;
    }
    public Player(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public Player() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    String email;
    int id;
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


    public void setManoDiCarte(ManoDiCarte manoDiCarte) {
        this.manoDiCarte = manoDiCarte;
    }

    @Override
    public String toString() {
        return "Player{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", manoDiCarte=" + manoDiCarte +
                '}';
    }
}
