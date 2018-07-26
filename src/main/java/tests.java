import java.util.*;

public class tests {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int count=0;
        List<String> shuffledDeck = new ArrayList<String>();
        for(int i=0;i<Card.suits.length;i++){
            for(int j=0;j<Card.ranks.length;j++){
                shuffledDeck.add(deck.getCard(i,j).cardToString());
                Collections.shuffle(shuffledDeck);
                //without shuffle
                //System.out.println(deck.getCard(i,j).cardToString());
                count++;
            }
        }
        for(String str:shuffledDeck){
            System.out.println(str);
        }
        System.out.println("There are "+count+" cards in this deck");

        //default interface
        TestInterface ti=new TestInterface();
        ti.show();
    }
}
