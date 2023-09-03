package com.gn4k.boodpressure.ui.heart.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gn4k.boodpressure.R;


public class HeartRateTracker extends Fragment {



    public HeartRateTracker() {
        // Required empty public constructor
    }


    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_heart_rate_tracker, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}