package com.gn4k.boodpressure.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.blood.HomeBlood;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RelativeLayout blood = findViewById(R.id.rl_blood);
        RelativeLayout heart = findViewById(R.id.rl_heart_rate);

        blood.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, HomeBlood.class);
            startActivity(intent);
        });

        heart.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, HomeBlood.class);
            startActivity(intent);
        });
    }
}