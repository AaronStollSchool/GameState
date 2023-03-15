package com.example.gamestate;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class GameState {

    private int p1Points;
    private int p2Points;

    private ArrayList<Card> deck;
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



    



    @Override
    public String toString() {

        String p1Vals = "Player 1 Points: " + String.valueOf(p1Points) +
                "Player 1 Hand: " + p1Hand.toString() + "Player 1 Round Score: " + p1RoundScore;
        String p2Vals = "Player 2 Points: " + String.valueOf(p2Points) +
                "Player 2 Hand: " + p2Hand.toString() + "Player 2 Round Score: " + p2RoundScore +
                "Round total score: " + roundScore;

        Log.d("Player1", ""+ String.valueOf(p1Points));
        Log.d("Player2", ""+ String.valueOf(p2Points));
        Log.d("Player1 Hand", p1Hand.toString());
        Log.d("Player2 Hand", p2Hand.toString());
        Log.d("Player1 Round Score", ""+p1RoundScore);
        Log.d("Player2 Round Score", ""+p2RoundScore);
        Log.d("Round Score total", ""+roundScore);

        return p1Vals + p2Vals;
    }
}
