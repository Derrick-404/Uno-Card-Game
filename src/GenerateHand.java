/**
 * The GenerateHand class is the backend of our game. Its purpose is
 * to set up the game by generating a deck and the player's hand
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */

import java.util.ArrayList;
import java.util.Random;

public class GenerateHand {
    public static void populateDeck(ArrayList<Card> deck) {
        for (Card.Color color : Card.Color.values()) {
            for (Card.Value value : Card.Value.values()) {
                deck.add(new Card(value, color));
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
