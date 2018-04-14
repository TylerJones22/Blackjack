
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
        //Makes a deck with every value and every suit from the CardSuit and CardIndex enums.
        for(CardSuit suit: CardSuit.values()){
            for (CardIndex index: CardIndex.values()){
                entireDeck.add(new Card(suit,index));
            }
        }
        Collections.shuffle(entireDeck);
    }

    public void displayList() {
        //Test method to make sure my deck is being built of the right cards.
        for (Card c : entireDeck) {
            System.out.print(c.getName() + "\n");
        }
    }
}
