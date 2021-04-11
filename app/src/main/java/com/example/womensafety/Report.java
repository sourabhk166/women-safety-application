package com.example.womensafety;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Report extends AppCompatActivity {
    TextView txt_message;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TextView txt_Message = (TextView) findViewById(R.id.articleLink);
        txt_Message.setText("You can read here the full article along with picture demonstrations https://www.healthline.com/health/womens-health/self-defense-tips-escape#protection-alternatives/");
        Linkify.addLinks(txt_Message, Linkify.WEB_URLS);
    }
}