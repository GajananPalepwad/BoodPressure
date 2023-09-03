package com.gn4k.boodpressure.ui.blood.tabs;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.blood.new_record_blood.NewRecordBloodScreen;
import com.gn4k.boodpressure.ui.blood.tabs.info.DetailInfo;


public class BloodPressureInfo extends Fragment {



    public BloodPressureInfo() {
        // Required empty public constructor
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blood_pressure_info, container, false);
        RelativeLayout relay_level_01 = view.findViewById(R.id.relay_level_01);
        RelativeLayout relay_level_02 = view.findViewById(R.id.relay_level_02);
        RelativeLayout relay_level_03 = view.findViewById(R.id.relay_level_03);
        RelativeLayout relay_level_04 = view.findViewById(R.id.relay_level_04);
        RelativeLayout relay_level_05 = view.findViewById(R.id.relay_level_05);
        RelativeLayout relay_level_06 = view.findViewById(R.id.relay_level_06);

        relay_level_01.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","1");
            startActivity(intent);
        });

        relay_level_02.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","2");
            startActivity(intent);
        });

        relay_level_03.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","3");
            startActivity(intent);
        });

        relay_level_04.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","4");
            startActivity(intent);
        });

        relay_level_05.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","5");
            startActivity(intent);
        });

        relay_level_06.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), DetailInfo.class);
            intent.putExtra("selected","6");
            startActivity(intent);
        });


        return view;
    }
}