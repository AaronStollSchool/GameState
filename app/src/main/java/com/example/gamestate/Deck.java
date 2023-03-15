package com.example.gamestate;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> gameDeck;
    private int deckIndex;

    public Deck(){
        gameDeck = new ArrayList<Card>();
        deckIndex = 0;

        for (int i = 0; i < 52; i++){
            int val = 0; // PLACEHOLDER FOR ACTUAL RANDOM GENERATION
            int suit = 0; // PLACEHOLDER FOR ACTUAL RANDOM GENERATION
            Card holder = new Card(val, suit);

            gameDeck.add(holder);
        }
    }

    public Card nextCard(){
        Card out = gameDeck.get(deckIndex);
        deckIndex++;

        return out;
    }
}
