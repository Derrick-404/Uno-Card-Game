import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class manages the deck of cards.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */

class Deck {
    private ArrayList<Card> cards;

    /**
     * Creates a new Deck with the standard
     * set of cards, then shuffles them
     */
    public Deck() {
        cards = new ArrayList<>();
        populateDeck();
        shuffleDeck();
    }

    /**
     * Populates the deck with every possible
     * uno card (excluding Skip and Reverse)
     */
    public void populateDeck() {
        for (Card.Color color : Card.Color.values()) {
            for (Card.Value value : Card.Value.values()) {
                if (value != Card.Value.WILD_DRAW_FOUR && value != Card.Value.WILD_CHANGE_COLOR) {
                    cards.add(new Card(value, color));
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            cards.add(new Card(Card.Value.WILD_DRAW_FOUR, null));
            cards.add(new Card(Card.Value.WILD_CHANGE_COLOR, null));
        }
    }

    /**
     * Randomly shuffles the deck to ensure it's
     * different each time the game is run.
     */
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    /**
     * Draws a card from the deck, and removes
     * it from the deck.
     * @return The drawn card, or null if the deck is empty
     */
    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.println("The deck is empty. No more cards to draw.");
            return null;
        } else {
            Card drawnCard = cards.get(0);
            cards.remove(0);
            return drawnCard;
        }
    }
}