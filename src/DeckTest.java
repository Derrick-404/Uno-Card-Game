import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    /**
     * Test of constructor, of class Deck.
     * This test verifies that the initial size of
     * the deck is correct after it is created.
     */
    @Test
    void testDeckGood() {
        Deck deck = new Deck();
        int deckSize = deck.size();
        assertEquals(92, deckSize);
    }

    /**
     * Test of drawCard method, of class Deck.
     * This test checks if an exception is thrown
     * when trying to draw a card from an empty deck.
     */
    @Test
    void testDrawCardBad() {
        Deck emptyDeck = new Deck();
        for (int i = 0; i < 92; i++) {
            emptyDeck.drawCard();
        }
        assertThrows(IllegalStateException.class, emptyDeck::drawCard);
    }

    /**
     * Test of drawCard method, of class Deck.
     * This test checks if the deck size is correct
     * after drawing one card.
     */
    @Test
    void testDrawCardBoundary() {
        Deck deck = new Deck();
        deck.drawCard();
        int deckSize = deck.size();
        assertEquals(91, deckSize);
    }
}
