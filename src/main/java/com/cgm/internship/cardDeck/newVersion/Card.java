package com.cgm.internship.cardDeck.newVersion;

public class Card {
    private RANK rank;
    private SUIT suit;

    public Card(RANK rank, SUIT suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + "of"+ suit;
    }

    public RANK valueOfCard(){return rank;}
}


