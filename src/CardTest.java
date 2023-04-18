import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    /**
     * Test of constructor and toString method, of class Card.
     * This test gives a good input which should
     * pass the JUnit Test.
     */
    @Test
    void testConstructorGood() {
        Card card = new Card(Card.Value.THREE, Card.Color.RED);
        String result = card.toString();
        assertEquals("THREE of RED", result);
    }

    /**
     * Test of constructor, of class Card.
     * This test gives a bad input which should
     * throw an IllegalArgumentException.
     */
    @Test
    void testConstructorBad() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card(null, Card.Color.RED);
        });
    }

    /**
     * Test of constructor and toString method, of class Card.
     * This test gives a boundary input which should
     * pass the JUnit Test.
     */
    @Test
    void testConstructorBoundary() {
        Card card = new Card(Card.Value.WILD_CHANGE_COLOR, null);
        String result = card.toString();
        assertEquals("WILD_CHANGE_COLOR", result);
    }
}