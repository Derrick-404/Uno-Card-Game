/**
 * The Card class creates a card.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */
class Card {
    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        DRAW_TWO, REVERSE, SKIP, WILD_CHANGE_COLOR, WILD_DRAW_FOUR;
    }

    public enum Color {
        RED, YELLOW, GREEN, BLUE
    }
    private Value value;
    private Color color;

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return value.toString() + " of " + color.toString();
    }
}