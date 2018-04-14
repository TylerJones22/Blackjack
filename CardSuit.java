public enum CardSuit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

    private String name;

    CardSuit(String name) {
        this. name= name;
    }

    public String getName() {
        return name;
    }
}
