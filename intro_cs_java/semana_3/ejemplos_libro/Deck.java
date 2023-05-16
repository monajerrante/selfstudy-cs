public static Deck {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace" };
        String[] deck = new String [SUITS.length * RANKS.length + 2];
        
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                deck[i] = RANKS[j] + " of " + SUITS[i];
            }
    }
}
