package com.example.gamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @authors Aaron Stoll, Aether Mocker, Kincaid Larson, Sean Murray
 * @version March 2023
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button testButton = findViewById(R.id.testButton);
        EditText etext = findViewById(R.id.textView);

        GameState first = new GameState();
        etext.setText(first.toString());

        testButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                etext.setText("");
                GameState firstInstance = new GameState();
                GameState secondInstance = new GameState(firstInstance);

                //call each method in GameState and print descriptions of the actions taken to the EditText
                firstInstance.setUpBoard(); //calls dealCards() and setFaceUpCards()
                etext.append("Hands of both players have been dealt.\n");
                etext.append("Face up card was drawn, the " + firstInstance.getFaceUpCard().toString() + ".\n");

                firstInstance.setPlayerTurn(1); //setPlayerTurn()
                etext.append("Dealer has been set to Player 1.\n");

                etext.append("Both player's statistics so far: \n" + firstInstance.toString() + "\n");

                firstInstance.discard(firstInstance.getHandCard(1, 0)); //discard()
                firstInstance.discard(firstInstance.getHandCard(1, 2));
                etext.append("Player 1 discarded " + firstInstance.getCribCard(0).toString() + " and " + firstInstance.getCribCard(1).toString() +" to the crib.\n");

                firstInstance.playCard(firstInstance.getHandCard(1,0)); //playCard()
                etext.append("Player 1 played the " + firstInstance.getLastPlayed().toString() + ".\n");

                firstInstance.endTurn(1);
                etext.append("Player 1 ended their turn.\n");

                etext.append("Now, player 1's hand size is " + firstInstance.getHandSize(1) + ".\n");

                firstInstance.exitGame(1);
                etext.append("Player 1 exited the game.\n");


                GameState thirdInstance = new GameState();
                GameState fourthInstance = new GameState(thirdInstance);

                String instance2Str = secondInstance.toString();
                String instance4Str = fourthInstance.toString();
            }
        });
    }


}