import java.util.ArrayList;

/**
 * Created by tyler on 10/7/16.
 */
public class HumanPlayer extends Player{

    private int money;
    private int betAmount;
    private String name;
    private boolean stand;
    private int cardValue;

    private boolean bust;

    public HumanPlayer(String name, int money) {
        this.name = name;
    }

    public void play() {
        while (!stand && !bust) {
            if(getMyValue() > 21){
                bust = true;
                break;
            }




            //option to hit or stand
            //need an option to split the hand
        }
        if (bust){
            loseHand();
        }
    }

    public void splitDoubles() {
        //If you are dealt two of the same cards on the first deal,
        //you can choose to play them as two hand and be dealt two more cards.
    }

    public void bet(int betAmount){
        this.betAmount = betAmount;
        //choose a number with scanner and set bet amount
    }

    public void loseHand(){
        money -= betAmount;
    }

    public void stand(){

    }

    public void bust(){}


}
