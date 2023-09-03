package com.gn4k.boodpressure.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.language.Languages;

public class Starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        Thread thread = new Thread() {

            public void run() {
                try {
                    sleep(2500);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Starting.this, Languages.class);
                    startActivity(intent);
                }
            }
        };thread.start();

    }
}