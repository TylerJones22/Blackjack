
import java.util.*;

/**
 * Created by tyler on 10/7/16.
 */
public class Deck {

    private int numberOfDecks = 1;

    private ArrayList<Card> decksCombined = new ArrayList<>();
    private static Map<Integer, Integer> cardFlags;

    static {
        Map<Integer, Integer> temp = new HashMap<>();
        temp.put(11, 1);
        temp.put(27, 1);
        temp.put(43, 1);
        temp.put(59, 1);

        cardFlags = Collections.unmodifiableMap(temp);
    }

    public Deck() {
        for (int j = 0; j < numberOfDecks; j++) {
            addDeck();
        }
        //Collections.shuffle(decksCombined);

    }

    public void addDeck() {
        //we want to add every card to the deck 52
        //127137 is the starting value of the unicode cards
        // and 127198 is the last value.
        //At the values of 127148, 127164, 127180, 127196 we have
        //unwanted values.
        //These need to be skipped.
        //At the end of every suit, there are two values we don't want
        //We need to skip these as well


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 14; j++) {
                int cardValue = j + (i * 16);
                if (cardFlags.containsKey(cardValue)) {
                    cardValue += cardFlags.get(cardValue);
                    j++;
                }
                if (j == 0)
                    decksCombined.add(new Card(Character.toChars(cardValue + 127137), 11));
                else if (j > 9)
                    decksCombined.add(new Card(Character.toChars(cardValue + 127137), 10));
                else
                    decksCombined.add(new Card(Character.toChars(cardValue + 127137), j + 1));
            }
        }
    }

    public Card dealCard() {
        if (!decksCombined.isEmpty()) {
            return decksCombined.remove(decksCombined.size() - 1);
        } else {
            System.out.println("Out of cards. Error.");
            return null;
        }

    }

    public void displayList() {

        for (Card c : decksCombined) {
            c.printCard();
            System.out.print(" ");
        }
    }
}
