package com.gn4k.boodpressure.ui.blood.tabs.info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.gn4k.boodpressure.R;

public class DetailInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        View toolBar = findViewById(R.id.toolbar);

        TextView title = toolBar.findViewById(R.id.tv_title);
        title.setText("Back");

        FrameLayout contentContainer = findViewById(R.id.contentContainer);
        Intent intent = getIntent();
        String selectedValue = intent.getStringExtra("selected");

        View newLayout = null;
        switch (selectedValue){
            case "1":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_01, null);
                break;
            case "2":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_02, null);
                break;
            case "3":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_03, null);
                break;
            case "4":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_04, null);
                break;
            case "5":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_05, null);
                break;
            case "6":
                newLayout = getLayoutInflater().inflate(R.layout.layout_content_info_06, null);
                break;

        }
        
        contentContainer.removeAllViews();
        contentContainer.addView(newLayout);


    }
}