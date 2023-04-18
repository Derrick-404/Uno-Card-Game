import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    private Player player;
    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
        player = new Player(deck);
    }

    /**
     * Test of handSize, of class Player.
     * This test verifies that the initial size of
     * the deck is correct after it is created.
     */
    @Test
    public void testInitialHandSizeGood() {
        int expectedHandSize = 7;
        assertEquals(expectedHandSize, player.getHandSize());
    }

    /**
     * Test of handSize, of class Player.
     * Test if the player's hand size doesn't
     * become negative after removing cards.
     */
    @Test
    public void testInitialHandSizeBad() {
        int initialHandSize = player.getHandSize();
        for (int i = 0; i < initialHandSize; i++) {
            player.removeCardFromHand(player.getCardFromHand(0));
        }
        int actualHandSize = player.getHandSize();
        assertFalse(actualHandSize < 0);
    }

    /**
     * Test of drawCard, of class Player.
     * Test if the player can draw a card
     * when there's only one card left in the deck.
     */
    @Test
    public void testDrawCardWithOneCardLeftInDeck() {
        while (deck.size() > 1) {
            deck.drawCard();
        }
        assertDoesNotThrow(() -> player.drawCard(deck));
    }
}
