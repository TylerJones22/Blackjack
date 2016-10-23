import java.util.ArrayList;

/**
 * Created by tyler on 10/18/16.
 */
abstract public class Player {

    protected ArrayList<Card> myCards;
    protected String name;
    protected int myValue;
    protected int numberOfAces;

    public Player() {
        myCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    abstract public void play();

    abstract public void loseHand();

    abstract public void bust();

    abstract public void stand();

    public void displayCards() {
        for (Card c : myCards) {
            c.printCard();
        }
    }

    public int getMyValue() {
        int tempValue = 0;
        for (Card c : myCards) {
            tempValue += c.getValue();
        }
        myValue = tempValue;
        return tempValue;
        //handle aces

    }

    public int numberOfAces() {
        for (Card c : myCards) {
            if (c.getValue() == 11) this.numberOfAces++;
        }
        return numberOfAces;

    }

    public void handleAces(){
        while(myValue > 21){

        }
    }


    public void receiveCard(Card card) {
        myCards.add(card);
    }

}
