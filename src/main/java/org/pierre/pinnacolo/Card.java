package org.pierre.pinnacolo;

public class Card {

    private final CardValues cv;
    private final Seeds seed;

    public Card(CardValues cv, Seeds seed) {
        this.cv = cv;
        this.seed = seed;
    }

    public CardValues getCv() {
        return cv;
    }

    public Seeds getSeed() {
        return seed;
    }

    @Override
    public String toString() {
        return "Card{" + "cv=" + cv + ", seed=" + seed + '}';
    }
}
