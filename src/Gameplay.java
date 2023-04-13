import java.util.Scanner;

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
        Deck deck = new Deck();
        Player player = new Player(deck);
        Game game = new Game(deck);

        while (player.getHandSize() > 0) {
            System.out.println("--------------------------");
            System.out.println("Top card: " + game.getTopCard());
            System.out.println("1: View your hand");
            System.out.println("2: View playable cards");
            System.out.println("3: Play a card");
            System.out.println("4: Draw a card");
            System.out.print("Select an option (1-4): ");
            System.out.println("\n--------------------------");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    player.printHand();
                    break;
                case 2:
                    player.printPlayableCards(game.getTopCard());
                    break;
                case 3:
                    System.out.print("Pick a card to play (number 1 - " + player.getHandSize() + "): ");
                    int cardNum = input.nextInt();
                    Card playedCard = player.getCardFromHand(cardNum - 1);

                    if (game.isValidMove(playedCard)) {
                        System.out.println("You played: " + playedCard);
                        player.removeCardFromHand(playedCard);
                        game.playCard(playedCard);
                        game.applySpecialCardAction(playedCard, player, deck);
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
                case 4:
                    player.drawCard(deck);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        System.out.println("Congratulations! You have played all your cards and won the game.");
        input.close();
    }
}
