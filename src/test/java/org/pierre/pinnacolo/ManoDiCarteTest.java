package org.pierre.pinnacolo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ManoDiCarteTest {
    ManoDiCarte manoDiCarte = new ManoDiCarte();
    @Test
    void findAllTrisOrPoker() {
        manoDiCarte.add(new Card(CardValues.V1, Seeds.QUADRI));
        manoDiCarte.add(new Card(CardValues.V2, Seeds.QUADRI));
        manoDiCarte.add(new Card(CardValues.V3, Seeds.QUADRI));
        List<CardCollection> result1 = manoDiCarte.findAllTrisOrPoker();
        //make sure duplicates don't count'
        assertEquals(0, result1.size());

        manoDiCarte.add(new Card(CardValues.V1, Seeds.CUORI));
        manoDiCarte.add(new Card(CardValues.V1, Seeds.FIORI));

        List<CardCollection> result2 = manoDiCarte.findAllTrisOrPoker();
        assertEquals(3, result2.get(0).size());

        manoDiCarte.add(new Card(CardValues.V1, Seeds.PICCHE));
        List<CardCollection> result3 = manoDiCarte.findAllTrisOrPoker();
        assertEquals(1, result3.size());
        assertEquals(4, result3.get(0).size());


    }
}