public class tests {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int count=0;
        for(int i=0;i<Card.suits.length;i++){
            for(int j=0;j<Card.ranks.length;j++){
                Card card = deck.getCard(i,j);
                System.out.println(card.cardToString());
                count++;
            }
        }
        System.out.println("There are "+count+" cards in this deck");

    }
}
