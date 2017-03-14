package com.example.kyecook.prac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class settingsActivity extends AppCompatActivity {

    private TextView valueOne;
    private TextView valueTwo;
    private SeekBar valueOneSeekBar;
    private SeekBar valueTwoSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        valueOne = (TextView) findViewById(R.id.valueOne);
        valueTwo = (TextView) findViewById(R.id.valueTwo);
        valueOneSeekBar = (SeekBar) findViewById(R.id.valueOneSeekBar);
        valueTwoSeekBar = (SeekBar) findViewById(R.id.valueTwoSeekBar);


        valueOneSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueOne.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        valueTwoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueTwo.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
