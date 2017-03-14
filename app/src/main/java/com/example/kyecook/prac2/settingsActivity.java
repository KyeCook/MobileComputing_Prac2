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

    private int rangeStart = 1;
    private int rangeFinish = 10;

    public void setRangeStart(int x){
        this.rangeStart = x;
    }
    public int getRangeStart(){
        return rangeStart;
    }

    public void setRangeFinish(int x){
        this.rangeFinish = x;
    }
    public int getRangeFinish(){
        return rangeFinish;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        valueOne = (TextView) findViewById(R.id.valueOne);
        valueOne.setText(String.valueOf(rangeStart));

        valueTwo = (TextView) findViewById(R.id.valueTwo);
        valueTwo.setText(String.valueOf(rangeFinish));


        valueOneSeekBar = (SeekBar) findViewById(R.id.valueOneSeekBar);
        valueTwoSeekBar = (SeekBar) findViewById(R.id.valueTwoSeekBar);


        valueOneSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueOne.setText(String.valueOf(progress));
                rangeStart = progress;

                System.out.println(rangeStart);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        valueTwoSeekBar.setProgress(rangeFinish);

        valueTwoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valueTwo.setText(String.valueOf(progress));
                rangeFinish = progress;

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
