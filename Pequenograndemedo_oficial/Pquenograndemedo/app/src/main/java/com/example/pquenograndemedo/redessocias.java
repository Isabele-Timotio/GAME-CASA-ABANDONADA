package com.example.pquenograndemedo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class redessocias extends AppCompatActivity {

    Button btnInstagram;
    Button btnThreads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redessocias);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnInstagram = findViewById(R.id.btnInstagram);
        btnInstagram.setOnClickListener(v -> {
            String url = "https://www.instagram.com/scary_sleep/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnThreads = findViewById(R.id.btnThreads);
        btnThreads.setOnClickListener(v -> {
            String url = "https://www.threads.net/@scary_sleep";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}