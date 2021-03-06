package com.example.kyecook.prac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView statusText;
    private EditText guessField;

    private int rangeStart = new settingsActivity().getRangeStart();;
    private int rangeFinish = new settingsActivity().getRangeFinish();;


    private int secretNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Random random = new Random();
        secretNumber = rangeStart + random.nextInt(rangeFinish);

        statusText = (TextView) findViewById(R.id.statusText);
        guessField = (EditText) findViewById(R.id.guessField);

        guessField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                try {
                    int guessInput = Integer.parseInt(s.toString());

                    if(guessInput == secretNumber) {
                        statusText.setText("You have found the secret number!");

                    } else if(guessInput < secretNumber) {
                        statusText.setText("Try a Little Higher");

                    } else {
                        statusText.setText("Try a little Lower");
                    }

                } catch (Exception e) {

                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public void settingsHandler (View view) {
        Intent intent = new Intent(this, settingsActivity.class);
        startActivity(intent);
    }
}
