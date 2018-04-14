
import java.util.*;


public class Deck {

    private ArrayList<Card> entireDeck = new ArrayList<Card>();




    public Deck() {
        populateDeck();

    }


    public Card dealCard() {
        if (!entireDeck.isEmpty()) {
            return entireDeck.remove(0);
        } else {
            System.out.println("Out of cards. Error.");
            populateDeck();
            return entireDeck.remove(0);
        }

    }

    public void populateDeck(){
        for(CardSuit suit: CardSuit.values()){
            for (CardIndex index: CardIndex.values()){
                entireDeck.add(new Card(suit,index));
            }
        }
        Collections.shuffle(entireDeck);
    }

    public void displayList() {

        for (Card c : entireDeck) {
            System.out.print(c.getName() + "\n");
        }
    }
}
