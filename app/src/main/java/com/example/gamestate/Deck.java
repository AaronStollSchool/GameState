package com.example.gamestate;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> gameDeck;
    private int deckIndex;

    public Deck(){
        gameDeck = new ArrayList<Card>();
        deckIndex = 0;

        for (int i = 1; i <= 4; i++){
            for(int j = 1; j <= 14; j++){
                int val = j;
                int suit = i;
                Card holder = new Card(val, suit);
                gameDeck.add(holder);
            }
        }
        Collections.shuffle(gameDeck);
    }

    public Card nextCard(){
        Card out = gameDeck.get(deckIndex);
        deckIndex++;

        return out;
    }


}
