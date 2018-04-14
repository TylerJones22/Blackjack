

public class Card {

    private CardSuit suit;
    private CardIndex index;
    private String name;
    private int numericValue;

    public Card(CardSuit suit, CardIndex index){
        this.index = index;
        this.suit = suit;
        setNumericValue();
        setName();
    }

    public CardIndex getIndex(){
        return index;
    }
    public CardSuit getSuit() {return suit;}
    public String getName(){return name;}
    public int getNumericValue(){return numericValue;}

    public void setNumericValue(){
            //All cards that are a ten are greater, are valued at 10.
            if (index.getCardIndex() >= CardIndex.TEN.getCardIndex()){
                numericValue = 10;
        } else {
                //Everything else is valued at its index number. The GameTable will handle ACE and use it as a flag,
                //because the value of an ACE is dependent on the state of the game.
                numericValue = index.getCardIndex();
            }
    }
    public void setName(){
        //Card name is built from the index of the card and then the suit. For example, Ace of Hearts.
        StringBuilder builder = new StringBuilder(index.getCardName());
        builder.append(" of ");
        builder.append(suit.getName());
        name = builder.toString();

    }

}
