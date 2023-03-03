import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Gameplay class is the entry point to our game.
 *
 * @author Derrick-404
 * @author Akaaash101
 * @author Ahmedbattal
 * @author Dhairya167
 */

public class Gameplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Card> deck = new ArrayList<>();
        ArrayList<Card> hand = new ArrayList<>();

        //Populates the Deck and Hand
        GenerateHand.populateDeck(deck);
        GenerateHand.populateHand(deck, hand, random);

        // Print the player's hand
        System.out.println("Your hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ": " + hand.get(i).toString());
        }

        System.out.print("Pick a card to play (number 1 - 7): ");
        int cardNum = input.nextInt();
        Card playedCard = hand.get(cardNum - 1);
        System.out.println("You played: " + playedCard.toString());
        hand.remove(playedCard);

        System.out.println("Your remaining hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ": " + hand.get(i).toString());
        }
    }
}