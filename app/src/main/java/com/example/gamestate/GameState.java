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
    // 0 Menu
    // 1 In Round
    // 2 Score Screen


    private int p1RoundScore;
    private int p2RoundScore;
    private int roundScore;

    public GameState() {
        p1Points = 0;
        p2Points = 0;

        cardDeck = new Deck();

        p1Hand = new ArrayList<Card>();
        p2Hand = new ArrayList<Card>();
        for (int i = 0; i < 6; i++) {
            p1Hand.add(cardDeck.nextCard());
            p2Hand.add(cardDeck.nextCard());
        }

        inPlayCards = null;
        crib = null;

        faceUpCard = cardDeck.nextCard();

        isHard = true;

        isPlayer1Dealer = true;
        if(isPlayer1Dealer) {
            isPlayer1Turn = false;
        }
        else {
            isPlayer1Turn = true;
        }

        phase = 0;
        p1RoundScore = 0;
        p2RoundScore = 0;
        roundScore = 0;
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
}
