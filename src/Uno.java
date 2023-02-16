import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Card> deck = new ArrayList<Card>();
        ArrayList<Card> hand = new ArrayList<Card>();
        String[] suits = { "Red", "Yellow", "Green", "Blue" };
        String[] ranks = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Draw 2", "Reverse", "Skip" };

        // Populate the deck with all the cards
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(ranks[j], suits[i]));
            }
        }

        // Deal 7 cards to the player
        for (int i = 0; i < 7; i++) {
            int cardIndex = random.nextInt(deck.size());
            hand.add(deck.get(cardIndex));
            deck.remove(cardIndex);
        }

        // Print the player's hand
        System.out.println("Your hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ": " + hand.get(i).toString());
        }

        System.out.println("Pick a card to play (number): ");
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

class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}