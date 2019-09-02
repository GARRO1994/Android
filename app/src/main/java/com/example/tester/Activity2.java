package com.example.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private RatingBar bar;
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        addListnerOnButton();
    }
    public void addListnerOnButton(){
        bar=(RatingBar)findViewById(R.id.ratingBar);
        view=(TextView)findViewById(R.id.textView2);
        bar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        view.setText("Значение: "+String.valueOf(rating)+". Спасибо!");
                    }
                }
        );
    }
}
