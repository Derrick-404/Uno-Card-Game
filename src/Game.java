import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Game class manages the game rules and actions.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */

class Game {
    private ArrayList<Card> discardPile;
    private Deck deck;

    /**
     * Creates a new Game instance and initializes
     * the discard pile with a card from the deck
     * @param deck
     */
    public Game(Deck deck) {
        this.deck = deck;
        Card initialCard = deck.drawCard();
        discardPile = new ArrayList<>();
        discardPile.add(initialCard);
    }

    /**
     * Returns the top card of the discard pile
     * @return
     */
    public Card getTopCard() {
        return discardPile.get(discardPile.size() - 1);
    }

    /**
     * Determines if the specified card is a valid move
     * @param card
     * @return
     */
    public boolean isValidMove(Card card) {
        Card topCard = getTopCard();
        return card.getColor() == topCard.getColor()
                || card.getValue() == topCard.getValue()
                || card.getValue() == Card.Value.WILD_DRAW_FOUR
                || card.getValue() == Card.Value.WILD_CHANGE_COLOR;
    }

    /**
     * Adds the card to the discard pile
     * @param card
     */
    public void playCard(Card card) {
        discardPile.add(card);
    }

    /**
     * Applies the special action associated
     * with the played card
     * @param card
     * @param player
     * @param deck
     */
    public void applySpecialCardAction(Card card, Player player, Deck deck) {
        switch (card.getValue()) {
            case DRAW_TWO:
                System.out.println("Draw Two card played! Drawing two cards...");
                player.drawCard(deck);
                player.drawCard(deck);
                break;
            case WILD_DRAW_FOUR:
                System.out.println("Wild Draw Four card played! Drawing four cards...");
                player.drawCard(deck);
                player.drawCard(deck);
                player.drawCard(deck);
                player.drawCard(deck);
                break;
            case WILD_CHANGE_COLOR:
                Scanner input = new Scanner(System.in);
                System.out.println("Wild Change Color card played! Choose a new color:");
                System.out.println("1: RED");
                System.out.println("2: YELLOW");
                System.out.println("3: GREEN");
                System.out.println("4: BLUE");
                System.out.print("Enter the number of the new color: ");
                int choice = input.nextInt();
                Card.Color newColor;
                switch (choice) {
                    case 1:
                        newColor = Card.Color.RED;
                        break;
                    case 2:
                        newColor = Card.Color.YELLOW;
                        break;
                    case 3:
                        newColor = Card.Color.GREEN;
                        break;
                    case 4:
                        newColor = Card.Color.BLUE;
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to RED.");
                        newColor = Card.Color.RED;
                }
                System.out.println("New color is: " + newColor);
                discardPile.add(new Card(Card.Value.WILD_CHANGE_COLOR, newColor));
                break;
            default:
                // Do nothing for non-special cards
        }
    }
}