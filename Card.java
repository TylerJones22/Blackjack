/**
 * Created by tyler on 10/7/16.
 */
public class Card {
    String[] cardNames = {"Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    private int value;
    char[] picture;

    public Card(char[] picture, int value){
        this.picture = picture;
        this.value = value;

    }

    public void printCard(){
        System.out.print(picture);
    }

    public int getValue(){
        return value;
    }

    public void reduceAce(){
        this.value -= 10;
    }
}
