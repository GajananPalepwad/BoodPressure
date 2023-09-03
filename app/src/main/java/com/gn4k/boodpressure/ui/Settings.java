package com.gn4k.boodpressure.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.ui.language.Languages;

public class Settings extends Fragment {

    public Settings() {
        // Required empty public constructor
        }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_settings, container, false);

        RelativeLayout relay_language_options = view.findViewById(R.id.relay_language_options);


        relay_language_options.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Languages.class);
            startActivity(intent);
            onDestroy();
        });


        return view;
    }
}