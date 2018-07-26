package com.cgm.internship.cardDeck.newVersion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> cards= new ArrayList<>();
        cards.addAll(deck.getDeck());
        Collections.shuffle(cards);
        for(Card card :cards){
            System.out.println(card.toString());
        }

    }
}
