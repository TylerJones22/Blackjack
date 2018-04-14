public enum PlayerChoices {
    STAND(1),
    HIT(2),
    SPLIT(3),
    SURRENDER(4),
    DOUBLEDOWN(5);

    private int choice;
    PlayerChoices(int choice){
        this.choice = choice;
    }
}
