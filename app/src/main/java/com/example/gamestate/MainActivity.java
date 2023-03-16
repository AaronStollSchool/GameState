package com.example.gamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button testButton = findViewById(R.id.testButton);
        EditText etext = findViewById(R.id.textView);

        testButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                etext.setText("");
                GameState firstInstance = new GameState();
                GameState secondInstance = new GameState(firstInstance);

                //call each method in GameState and print descriptions of the actions taken to the EditText
                etext.setText(""+firstInstance.toString());

                GameState thirdInstance = new GameState();
                GameState fourthInstance = new GameState(thirdInstance);
            }
        });
    }


}