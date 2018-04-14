/*
Enum for card index. Hesitant to call it "CardValue", because the value of the card in blackjack won't necessarily
be the same as the card index used in this enum. Trying to avoid confusion.
 */

public enum CardIndex {
    ACE(1, "Ace"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    TEN(10, "Ten"),
    JACK(11, "Jack"),
    QUEEN(12, "Queen"),
    KING(13, "King");


    private int cardIndex;
    private String name;

    CardIndex(int index, String name) {
        this.cardIndex = index;
        this.name = name;
    }

    public int getCardIndex() {
        return cardIndex;
    }
    public String getCardName(){return name;}
}
