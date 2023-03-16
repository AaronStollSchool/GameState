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
                etext.append("hands of both players have been dealt\n");
                etext.append("face up card has been set to a card with the value " + firstInstance.getFaceUpCard().getCardValue() + " and suit " + firstInstance.getFaceUpCard().getSuit() + "\n");
                firstInstance.setPlayerTurn(1);
                etext.append("dealer has been set to player 1\n");
                firstInstance.exitGame(0);
                etext.append("game was exited\n");
                //firstInstance.playCard();
                //firstInstance.endTurn();
                //firstInstance.discard();

                //etext.append("test");

                GameState thirdInstance = new GameState();
                GameState fourthInstance = new GameState(thirdInstance);

                String instance2Str = secondInstance.toString();
                String instance4Str = fourthInstance.toString();
            }
        });
    }


}