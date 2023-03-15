package com.example.gamestate;

public class Card {

    private int cardValue;
    // 1-10 regular cards
    // 11-14 Jack, Queen, King, Ace
    private int suit;
    // 1-4 diamond, heart, spade, club

    public Card(int val, int suit){
       cardValue = val;
       this.suit = suit;
    }

    public int getCardValue() {return cardValue;}
    public int getSuit() {return suit;}
}
