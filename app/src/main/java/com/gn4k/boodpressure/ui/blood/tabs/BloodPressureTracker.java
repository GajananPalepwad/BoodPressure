package com.gn4k.boodpressure.ui.blood.tabs;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.blood.new_record_blood.NewRecordBloodScreen;

public class BloodPressureTracker extends Fragment {


    public BloodPressureTracker() {
        // Required empty public constructor
    }

    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blood_pressure_tracker, container, false);

        CardView newRecord = view.findViewById(R.id.btn_newRecord);

        newRecord.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), NewRecordBloodScreen.class);
            startActivity(intent);
        });

        return view;
    }
}