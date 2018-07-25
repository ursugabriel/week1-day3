public class Card {

    private int suit;
    private int rank;

    public static final String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    public static final String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public Card(int suits,int rank){
        this.suit=suits;
        this.rank=rank;
    }


    public String cardToString(){

      return ranks[rank]+" of "+suits[suit];

    }
}
