package com.example.gamestate;

import java.util.ArrayList;

public class GameState {

    private int p1Points;
    private int p2Points;

    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    private Deck cardDeck;

    private ArrayList<Card> inPlayCards;
    private ArrayList<Card> crib;

    private Card faceUpCard;

    private boolean isHard;

    private boolean isPlayer1Turn;
    private boolean isPlayer1Dealer;

    private int phase;


    private int p1RoundScore;
    private int p2RoundScore;
    private int roundScore;

    public GameState(){
        p1Points = 0;
        p2Points = 0;

        cardDeck = new Deck();

        p1Hand = new ArrayList<Card>();
        p2Hand = new ArrayList<Card>();
        for (int i = 0; i < 6; i++){
            p1Hand.add(cardDeck.nextCard());
            p2Hand.add(cardDeck.nextCard());
        }

        inPlayCards = null;
        crib = null;

        faceUpCard = cardDeck.nextCard();

        isHard = true;

        isPlayer1Dealer = true;
        if(isPlayer1Dealer){
            isPlayer1Turn = false;
        }
        else{ isPlayer1Turn = true;
        }


        phase = null;
        p1RoundScore = 0;
        p2RoundScore = 0;
        roundScore = 0;
    }

    public boolean discard(boolean currentPlayer, int currentPhase, ArrayList<Card> hand) {
        // check if AI turn (if so, call AI discard choice method)
        if(!currentPlayer) "".isEmpty(); // to be implemented

        // loop through Player X hand, verify 2 cards selected
        int sum = 0;
        for(Card c : hand)
        {
            if(c.isSelected()) sum++;
        }

        // move discarded cards to crib array


        return false;
    }


}
