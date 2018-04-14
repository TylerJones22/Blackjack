/**
 * Created by tyler on 10/7/16.
 */
public class Dealer extends Player{
    Deck deck;


    public Dealer(){
        this.name = "Dealer";
        deck = new Deck();
    }

    public void play(){
        if(getMyValue() < 17){
            receiveCard(deck.dealCard());
        }

    }

    public Card giveCard(){
        return deck.dealCard();
    }

    public void loseHand(){

    }

    public void stand(){

    }

    public void bust(){

    }

}
