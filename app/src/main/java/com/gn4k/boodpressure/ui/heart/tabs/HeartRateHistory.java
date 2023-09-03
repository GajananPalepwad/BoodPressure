package com.gn4k.boodpressure.ui.heart.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gn4k.boodpressure.R;

public class HeartRateHistory extends Fragment {



    public HeartRateHistory() {
        // Required empty public constructor
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_heart_rate_history, container, false);
        return view;
    }
}