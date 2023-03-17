package com.example.gamestate;

/**
 * @authors Aaron Stoll, Aether Mocker, Kincaid Larson, Sean Murray
 * @version March 2023
 */
public class Card {

    private int cardValue;
    // 2-10 regular cards
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

    public String toString()
    {
        String s1 = "";
        String s2 = "";
        switch (cardValue)
        {
            case 11:
                s1 = "J";//"Jack";
                break;
            case 12:
                s1 = "Q";//"Queen";
                break;
            case 13:
                s1 = "K";//"King";
                break;
            case 14:
                s1 = "A";//"Ace";
                break;
            default:
                s1 = Integer.toString(cardValue);
                break;
        }

        switch (suit){
            case 1:
                s2 = "\u2666";//"Diamonds";
                break;
            case 2:
                s2 = "\u2764";//"Hearts";
                break;
            case 3:
                s2 = "\u2660";//"Spades";
                break;
            case 4:
                s2 = "\u2663";//"Clubs";
                break;
            default:
                s2 = "Game Test Cards";
                break;
        }

        return (s1 + " " + s2);//(s1 + " of " + s2);
    }


}
