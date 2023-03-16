package com.example.gamestate;

/**
 * @authors Aaron, Aether, Kincaid, Sean
 * @version March 2023
 */
public class Card {

    private int cardValue;
    // 1-10 regular cards
    // 11-14 Jack, Queen, King, Ace
    private int suit;
    // 1-4 diamond, heart, spade, club


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
