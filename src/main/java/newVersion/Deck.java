package newVersion;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        for(SUIT suit:SUIT.values()){
            for(RANK rank: RANK.values()){
                Card card = new Card(rank,suit);
                deck.add(card);
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

}
