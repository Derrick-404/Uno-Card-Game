/**
 * The Card class creates a card.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */
class Card {

    /**
     * Enumeration of every single card
     * in the game
     */
    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        DRAW_TWO, WILD_DRAW_FOUR, WILD_CHANGE_COLOR;
    }

    /**
     * Enumeration of every color
     * in the game
     */
    public enum Color {
        RED, YELLOW, GREEN, BLUE
    }
    private Value value;
    private Color color;

    /**
     * Creates a Card with the
     * specified value and color
     * @param value
     * @param color
     */
    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }

    /**
     * Gets the value of the card
     * @return
     */
    public Value getValue() {
        return value;
    }

    /**
     * Gets the color of the card
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns a string representation
     * of the card.
     * @return
     */
    public String toString() {
        if (color == null) {
            return value.toString();
        } else {
            return value.toString() + " of " + color.toString();
        }
    }
}