package org.pierre.pinnacolo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardCollectionTest {

    @Test
    void nonDuplicates() {
        CardCollection cardCollection = new CardCollection();
        cardCollection.add(new Card(CardValues.V1, Seeds.QUADRI));
        cardCollection.add(new Card(CardValues.V1, Seeds.QUADRI));
        cardCollection.add(new Card(CardValues.V1, Seeds.QUADRI));
        cardCollection.add(new Card(CardValues.V1, Seeds.QUADRI));
        CardCollection nonDuplicates = cardCollection.nonDuplicates();
        assertEquals(1, nonDuplicates.size());
    }
}