/**
 * The Card class creates a card.
 *
 * @author Derrick-404
 */
class Card {
    public enum Rank {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, DRAW_TWO, REVERSE, SKIP
    }

    public enum Suit {
        RED, YELLOW, GREEN, BLUE
    }
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }
}