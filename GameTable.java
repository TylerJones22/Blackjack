import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tyler on 10/7/16.
 */
public class GameTable {
    static ArrayList<HumanPlayer> playerList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static private int minimumBet = 25;

    public static void main(String[] args) {


        setup();





    }

    public static int players;
    public static int startingAmount = 200;

    public static int numberOfDecks = 1;

    Dealer dealer = new Dealer();

    public String welcome() {
        return ("Welcome to Tyler's Blackjack Game!\n" +
                "The minimum bet is " + minimumBet +
                " and your starting amount is " + startingAmount);
    }

    public static void setup() {

        ArrayList<Deck> decks = new ArrayList<>();

        do {
            System.out.println("How many players will be playing?");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid amount of players.");
                sc.next();
            }
            players = sc.nextInt();
        } while (players <= 0);


        for (int i = 0; i < players; i++) {
            System.out.print("Enter a player name: ");
            playerList.add(new HumanPlayer(sc.next(), startingAmount));
        }

        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck());
        }
        for (Deck d: decks
             ) {
            d.displayList();
        }
    }



}
