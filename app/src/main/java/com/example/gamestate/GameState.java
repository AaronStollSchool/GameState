package com.example.gamestate;

import android.util.Log;

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

    private int playerTurn;
    //player 1 turn: 1
    //player 2 turn: 2
    private boolean isPlayer1Dealer;

    private int phase;
    // 0 Menu
    // 1 In Round
    // 2 Score Screen


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

        inPlayCards = new ArrayList<Card>();
        crib = new ArrayList<Card>();

        faceUpCard = cardDeck.nextCard();

        isHard = true;

        phase = 0;
        p1RoundScore = 0;
        p2RoundScore = 0;
        roundScore = 0;

        setUpBoard();
    }

    //copy constructor
    //takes a given GameState and does a deep copy
    public GameState(GameState gamestate) {
        this.p1Points = gamestate.p1Points;
        this.p2Points = gamestate.p2Points;

        this.p1Hand = new ArrayList<Card>();
        this.p1Hand.addAll(gamestate.p1Hand);
        this.p2Hand = new ArrayList<Card>();
        this.p2Hand.addAll(gamestate.p2Hand);

        this.inPlayCards = new ArrayList<Card>();
        this.inPlayCards.addAll(gamestate.inPlayCards);
        this.crib = new ArrayList<Card>();
        this.crib.addAll(gamestate.crib);

        this.faceUpCard = new Card(gamestate.faceUpCard.getCardValue(), gamestate.faceUpCard.getSuit());

        this.isHard = gamestate.isHard;

        this.isPlayer1Dealer = gamestate.isPlayer1Dealer;

        //need to set up GamePhase
        this.phase = gamestate.phase;

        this.p1RoundScore = gamestate.p1RoundScore;
        this.p2RoundScore = gamestate.p2RoundScore;
        this.roundScore = gamestate.roundScore;
    }

    public boolean cardSelect(boolean playerID, Card select){
        return true;
    }

    public void dealCards() {
        for (int i = 0; i < 6; i++){
            p1Hand.add(cardDeck.nextCard());
            p2Hand.add(cardDeck.nextCard());
        }
    }
    public boolean setFaceUpCard() {
        faceUpCard = cardDeck.nextCard();
        return true;
    }

    public boolean setPlayerTurn(int p) {
        playerTurn = p;
        return true;
    }

    public boolean exitGame(int playerID){
        if (phase == 0){ // Game Phase is Menu cannot exit
            return false;
        }
        if (playerID != playerTurn){ // Not given players turn
            return false;
        }
        phase = 0;
        return true;
    }

    //compiles all setting up actions so that it's easier to call.
    //change: setPlayerTurn (?) this needs to be adaptable for change of turns(or j make separate)
    public boolean setUpBoard() {
        dealCards();
        setFaceUpCard();
        setPlayerTurn(playerTurn);
        return true;
    }

    public boolean isPlayable(Card c) {
        if(c.getCardValue() + roundScore <= 31) {
            return true;
        }
        else {
            return false;
        }
    }

    //playCard just simply removes card from the hand
    // to the table in the inPlayCards arrayList
    public boolean playCard(Card c) {
        if(playerTurn == 1) {
            if(isPlayable(c) == true) {
                p1Hand.remove(c);
                inPlayCards.add(c);
                return true;
            }
        }
        else if(playerTurn == 2){
            if(isPlayable(c) == true) {
                p2Hand.remove(c);
                inPlayCards.add(c);
                return true;
            }
        }
        return false;
    }

    //can be end turn or change turn, not sure if completely needed
    public boolean endTurn() {
        if(playerTurn == 1) { //if it's player 1's turn, make it player 2's.
            playerTurn = 2;
            return true;
        }
        else if(playerTurn == 2) {
            playerTurn = 1;
            return true;
        }
        return false;
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

    @Override
    public String toString() {

        String p1Vals = "Player 1 Points: " + String.valueOf(p1Points) +
                "Player 1 Hand: " + p1Hand.toString() + "Player 1 Round Score: " + p1RoundScore;
        String p2Vals = "Player 2 Points: " + String.valueOf(p2Points) +
                "Player 2 Hand: " + p2Hand.toString() + "Player 2 Round Score: " + p2RoundScore +
                "Round total score: " + roundScore;

        return p1Vals + p2Vals;
    }
}
