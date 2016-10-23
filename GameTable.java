import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tyler on 10/7/16.
 */
public class GameTable {
    static ArrayList<HumPlayer> playerList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static private int minimumBet = 25;

    public static void main(String[] args) {


        setup();
        d.displayList();
        //game loop
        while (true) {
            for (Player p : playerList) {
                int bet;
               do {
                    System.out.println("What would you like to bet, " + p.getName() + "?");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid bet.");
                        sc.next();
                    }
                    bet = sc.nextInt();
                    p.bet(bet);
                } while (bet < minimumBet);

                p.receiveCard(d.dealCard());
                p.receiveCard(d.dealCard());

            }
            break;
        }

        for (Player p : playerList) {
            for (int i = 0; i < p.getMyCards().size(); i++) {
                p.getMyCards().get(i).printCard();
            }
        }


    }

    public static int players;
    public static int startingAmount = 200;

    public static int numberOfDecks = 6;

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
            playerList.add(new Player(sc.next(), startingAmount));
        }

        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck());
        }

    }


    public String display() {
        return "todo";

    }

}
