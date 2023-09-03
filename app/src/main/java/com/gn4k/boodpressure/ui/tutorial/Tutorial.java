package com.gn4k.boodpressure.ui.tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.Home;

import java.util.ArrayList;

public class Tutorial extends AppCompatActivity {

    TextView tv_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        tv_next = findViewById(R.id.tv_next);

        tv_next.setOnClickListener(v -> {
            Intent intent = new Intent(Tutorial.this, Home.class);
            startActivity(intent);
        });

        ArrayList<IntroModel> arrayList = new ArrayList<>();
        arrayList.add(new IntroModel(R.drawable.guide_1, getResources().getString(R.string.Get_your_Blood_Pressure_in_Check), getResources().getString(R.string.Track_record_and_analyze_your_Blood_Pressure)));
        arrayList.add(new IntroModel(R.drawable.guide_2, getResources().getString(R.string.Professional_Chart_Analysis), getResources().getString(R.string.Control_blood_Pressure_trends_more_clearly)));
        arrayList.add(new IntroModel(R.drawable.guide_3, getResources().getString(R.string.Learning_about_Blood_Pressure), getResources().getString(R.string.Improve_your_lifestyle_health_knowledge_better_and_better)));
        ViewPager2 viewPager2 = findViewById(R.id.view_pager2);
        IntroAdapter introAdapter = new IntroAdapter(arrayList,this);
        viewPager2.setAdapter(introAdapter);
        viewPager2.registerOnPageChangeCallback(onPageChangeCallback);

    }


    private final ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            animateIndicatorDots(position);
        }
    };


    private void animateIndicatorDots(int position) {
        ImageView dot1 = findViewById(R.id.view_1);
        ImageView dot2 = findViewById(R.id.view_2);
        ImageView dot3 = findViewById(R.id.view_3);

        // Set the appropriate dot drawable based on the position
        switch (position) {
            case 0:
                dot1.setImageResource(R.drawable.ic_dot_01);
                dot2.setImageResource(R.drawable.ic_dot_02);
                dot3.setImageResource(R.drawable.ic_dot_02);
                break;
            case 1:
                dot1.setImageResource(R.drawable.ic_dot_02);
                dot2.setImageResource(R.drawable.ic_dot_01);
                dot3.setImageResource(R.drawable.ic_dot_02);
                break;
            case 2:
                dot1.setImageResource(R.drawable.ic_dot_02);
                dot2.setImageResource(R.drawable.ic_dot_02);
                dot3.setImageResource(R.drawable.ic_dot_01);
                break;
        }
    }


    private void animateDot(ImageView dot, float scale, float alpha) {
        dot.animate()
                .scaleX(scale)
                .scaleY(scale)
                .alpha(alpha)
                .setDuration(300) // Adjust the duration as needed
                .start();
    }

}