
public class Deck {
    private Card cards[][];

    public Deck(){
        cards = new Card[Card.suits.length][Card.ranks.length];
        for(int i=0;i<Card.suits.length;i++){
            for(int j=0;j<Card.ranks.length;j++){
                cards[i][j]=new Card(i,j);
            }
        }
    }



    public Card getCard(int suit,int rank){
        return cards[suit][rank];
    }
}
