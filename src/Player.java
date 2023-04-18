import java.util.ArrayList;

/**
 * The Player class manages the player's hand and actions.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */

class Player {
    private ArrayList<Card> hand;

    /**
     * Creates a new Player instance and initializes the
     * player's hand with 7 cards drawn from the deck
     * @param deck
     */
    public Player(Deck deck) {
        hand = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            hand.add(deck.drawCard());
        }
    }

    /**
     * Prints the player's hand with card numbers
     */
    public void printHand() {
        System.out.println("Your hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ": " + hand.get(i).toString());
        }
    }

    /**
     * Prints the playable cards based off the
     * top card in the discard pile
     * @param topCard
     */
    public void printPlayableCards(Card topCard) {
        System.out.println("Playable cards: ");
        int count = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            if (card.getColor() == topCard.getColor()
                    || card.getValue() == topCard.getValue()
                    || card.getValue() == Card.Value.WILD_DRAW_FOUR
                    || card.getValue() == Card.Value.WILD_CHANGE_COLOR) {
                System.out.println((i + 1) + ": " + card.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No playable cards.");
        }
    }

    /**
     * Returns the number of cards in
     * the player's hand
     * @return
     */
    public int getHandSize() {
        return hand.size();
    }

    /**
     * Adds a card to the player's hand
     * @param deck
     */
    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    /**
     * Retrieves a card from the player's
     * hand based on the index
     * @param index
     * @return
     */
    public Card getCardFromHand(int index) {
        return hand.get(index);
    }

    /**
     * Removes a card from the player's hand
     * @param card
     */
    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }
}