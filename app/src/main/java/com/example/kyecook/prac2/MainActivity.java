package com.example.kyecook.prac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView statusText;
    private EditText guessField;



    private int secretNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        secretNumber = 1 + random.nextInt(10);


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
}
