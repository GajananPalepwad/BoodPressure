package com.gn4k.boodpressure.ui.heart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.Settings;
import com.gn4k.boodpressure.ui.blood.tabs.BloodPressureHistory;
import com.gn4k.boodpressure.ui.blood.tabs.BloodPressureInfo;
import com.gn4k.boodpressure.ui.blood.tabs.BloodPressureTracker;
import com.gn4k.boodpressure.ui.heart.tabs.HeartRateHistory;
import com.gn4k.boodpressure.ui.heart.tabs.HeartRateTracker;

public class HomeHeart extends AppCompatActivity {

    View nav, tool ;
    LinearLayout tracker;
    LinearLayout history ;
    LinearLayout settings;
    private FragmentManager fragmentManager;
    ImageView ivTracker, ivHistory, ivInfo, ivSettings;
    TextView tvTracker, tvHistory, tvInfo, tvSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_heart);

        nav = findViewById(R.id.nav_bottom);
        LinearLayout info = nav.findViewById(R.id.ll_info);
        info.setVisibility(View.GONE);

        tool = findViewById(R.id.toolbar);
        TextView title = tool.findViewById(R.id.tv_title);
        title.setText(getResources().getString(R.string.Heart_Rate_Tracker));




        fragmentManager = getSupportFragmentManager();
        replaceFragment(new HeartRateTracker());


        tracker = nav.findViewById(R.id.ll_tracker);
        history = nav.findViewById(R.id.ll_history);
        settings = nav.findViewById(R.id.ll_settings);

        tvTracker = nav.findViewById(R.id.tv_tracker);
        tvHistory = nav.findViewById(R.id.tv_history);
        tvInfo = nav.findViewById(R.id.tv_info);
        tvSettings = nav.findViewById(R.id.tv_settings);

        ivTracker = nav.findViewById(R.id.iv_tracker);
        ivHistory = nav.findViewById(R.id.iv_history);
        ivInfo = nav.findViewById(R.id.iv_info);
        ivSettings = nav.findViewById(R.id.iv_settings);


        tracker.setOnClickListener(v -> {

            resetTabState();
            title.setText(getResources().getString(R.string.Blood_Pressure_Tracker));
            tvTracker.setTextColor(getResources().getColor(R.color.color_4969D7));
            ivTracker.setImageResource(R.drawable.ic_tracker_01);
            replaceFragment(new HeartRateTracker());


        });

        history.setOnClickListener(v -> {

            resetTabState();
            title.setText(getResources().getString(R.string.History));
            tvHistory.setTextColor(getResources().getColor(R.color.color_4969D7));
            ivHistory.setImageResource(R.drawable.ic_history_01);
            replaceFragment(new HeartRateHistory());


        });


        settings.setOnClickListener(v -> {

            resetTabState();
            title.setText(getResources().getString(R.string.Settings));
            tvSettings.setTextColor(getResources().getColor(R.color.color_4969D7));
            ivSettings.setImageResource(R.drawable.ic_settings_01);
            replaceFragment(new Settings());


        });




    }

    void resetTabState() {
        ivTracker.setImageResource(R.drawable.ic_tracker_02);
        ivHistory.setImageResource(R.drawable.ic_history_02);
        ivSettings.setImageResource(R.drawable.ic_settings_02);

        tvTracker.setTextColor(getResources().getColor(R.color.color_BCCADC));
        tvHistory.setTextColor(getResources().getColor(R.color.color_BCCADC));
        tvSettings.setTextColor(getResources().getColor(R.color.color_BCCADC));
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.tabs, fragment);
        transaction.addToBackStack(null); // Optional: Add to back stack for navigation
        transaction.commit();
    }
}