package com.example.gamestate;

import android.util.Log;

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



    @Override
    public String toString() {

        Log.d("Player1", ""+ String.valueOf(p1Points));
        Log.d("Player2", ""+ String.valueOf(p2Points));
        Log.d("Player1 Hand", p1Hand.toString());
        Log.d("Player2 Hand", p2Hand.toString());
        Log.d("Player1 Round Score", ""+p1RoundScore);
        Log.d("Player2 Round Score", ""+p2RoundScore);
        Log.d("Round Score total", ""+roundScore);

        return null;
    }
}
