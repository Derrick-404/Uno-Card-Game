/**
 * The GenerateHand class is the backend of our game. Its purpose is
 * to set up the game by generating a deck and the player's hand
 *
 * @author Derrick-404
 */

import java.util.ArrayList;
import java.util.Random;

public class GenerateHand {
    public static void populateDeck(ArrayList<Card> deck) {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public static void populateHand(ArrayList<Card> deck, ArrayList<Card> hand, Random random) {
        for (int i = 0; i < 7; i++) {
            int cardIndex = random.nextInt(deck.size());
            hand.add(deck.get(cardIndex));
            deck.remove(cardIndex);
        }
    }
}
