package com.example.gamestate;

public class Card {

    private int cardValue;
    private int suit;

    private boolean isSelected;

    public Card(int val, int suit){
       cardValue = val;
       this.suit = suit;
       isSelected = false;

    }

    public int getCardValue() { return cardValue; }
    public int getSuit() { return suit; }
    public boolean isSelected() { return isSelected; }

    public void toggleSelected() { isSelected = !(isSelected); }

}
