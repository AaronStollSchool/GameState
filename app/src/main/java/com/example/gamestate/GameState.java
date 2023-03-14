package com.example.gamestate;

import java.util.ArrayList;

public class GameState {

    private int p1Points;
    private int p2Points;

    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;

    private ArrayList<Card> inPlayCards;
    private ArrayList<Card> crib;

    private Card faceUpCard;

    private boolean isHard;

    private boolean isPlayer1Turn;
    private boolean isPlayer1Dealer;

    private GamePhase phase;


    private int p1RoundScore;
    private int p2RoundScore;
    private int roundScore;

    public GameState(){
        p1Points = 0;
        p2Points = 0;

        p1Hand = null;
        p2Hand = null;

        inPlayCards = null;
        crib = null;

        faceUpCard = null;

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


}
