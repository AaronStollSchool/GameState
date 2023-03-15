package com.example.gamestate;

public class Card {

    private int cardValue;
    private int suit;

    public Card(int val, int suit){
       cardValue = val;
       this.suit = suit;
    }

    public int getCardValue() {return cardValue;}
    public int getSuit() {return suit;}
}
