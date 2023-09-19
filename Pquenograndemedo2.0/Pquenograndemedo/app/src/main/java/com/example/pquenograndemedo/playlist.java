package com.example.pquenograndemedo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playlist extends AppCompatActivity {

    Button btnSpotify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSpotify = findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://open.spotify.com/playlist/2242H7u9BWwOSaId4u5mWO?si=d987ee076f1c4f54";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }

}

