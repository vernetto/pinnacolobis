package org.pierre.pinnacolo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ManoDiCarteTest {
    ManoDiCarte manoDiCarte = new ManoDiCarte();
    @Test
    void findAllTrisOrPoker() {
        manoDiCarte.add(new Card(CardValues.V1, Seeds.CUORI));
        manoDiCarte.add(new Card(CardValues.V1, Seeds.FIORI));
        manoDiCarte.add(new Card(CardValues.V1, Seeds.PICCHE));
        manoDiCarte.add(new Card(CardValues.V1, Seeds.QUADRI));
        manoDiCarte.add(new Card(CardValues.V2, Seeds.QUADRI));
        manoDiCarte.add(new Card(CardValues.V3, Seeds.QUADRI));
        List<List<Card>> result = manoDiCarte.findAllTrisOrPoker();
        assertEquals(1, result.size());

    }
}