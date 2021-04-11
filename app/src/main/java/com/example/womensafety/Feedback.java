package com.example.womensafety;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    RatingBar rt;
    Button sendFeedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        rt = (RatingBar) findViewById(R.id.ratingBar);
        LayerDrawable stars=(LayerDrawable)rt.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        sendFeedbackButton = findViewById(R.id.sendFeedbackNow);
        sendFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Feedback.this, "Thanks for your Feedback ! ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Call(View v)
    {
        TextView t = (TextView)findViewById(R.id.youRated);
        t.setText("You Rated :"+String.valueOf(rt.getRating()));
    }


}