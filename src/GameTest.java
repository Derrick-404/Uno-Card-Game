import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;
    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
        game = new Game(deck);
    }

    /**
     * Test of isValidMove, of class Game.
     * Test if the isValidMove method returns
     * true for a valid card.
     */
    @Test
    public void testIsValidMoveGood() {
        Card topCard = game.getTopCard();
        Card validCard = new Card(topCard.getValue(), topCard.getColor());
        assertTrue(game.isValidMove(validCard));
    }

    /**
     * Test of isValidMove, of class Game.
     * Test if the isValidMove method returns
     * false for an invalid card.
     */
    @Test
    public void testIsValidMoveBad() {
        Card topCard = game.getTopCard();
        Card invalidCard;
        if (topCard.getColor() == Card.Color.RED) {
            invalidCard = new Card(topCard.getValue() == Card.Value.ONE ? Card.Value.TWO : Card.Value.ONE, Card.Color.YELLOW);
        } else {
            invalidCard = new Card(topCard.getValue() == Card.Value.ONE ? Card.Value.TWO : Card.Value.ONE, Card.Color.RED);
        }
        assertFalse(game.isValidMove(invalidCard));
    }

    /**
     * Test of playCard, of class Game.
     * Test if the discard pile is updated
     * correctly after playing a valid card.
     */
    @Test
    public void testPlayCard() {
        Card topCard = game.getTopCard();
        Card validCard = new Card(topCard.getValue(), topCard.getColor());
        game.playCard(validCard);
        assertEquals(validCard, game.getTopCard());
    }
}
