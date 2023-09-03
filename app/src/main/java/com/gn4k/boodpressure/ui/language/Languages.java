package com.gn4k.boodpressure.ui.language;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.data.model.LanguageModel;
import com.gn4k.boodpressure.ui.tutorial.Tutorial;
import com.gn4k.boodpressure.utils.SystemUtil;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.facebook.*;
import java.util.ArrayList;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class Languages extends AppCompatActivity implements IClickLanguage{


    private LanguageModel model = new LanguageModel();
    private LanguageAdapter adapter;
    private RecyclerView rcl_language;
    private AdView adView;
    private ShimmerFrameLayout shimmerFrameLayout;
    private FrameLayout frAds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        rcl_language = findViewById(R.id.rcl_language);

        adapter = new LanguageAdapter(this, setLanguageDefault(), this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rcl_language.setLayoutManager(layoutManager);
        rcl_language.setAdapter(adapter);


    }

    public void ivDone(View view){
        Intent intent = new Intent(Languages.this, Tutorial.class);
        startActivity(intent);
    }


    private final List<LanguageModel> setLanguageDefault() {
        List<LanguageModel> arrayList = new ArrayList<>();
        String preLanguage = SystemUtil.getPreLanguage(this);
        Intrinsics.checkNotNullExpressionValue(preLanguage, "getPreLanguage(this)");
        arrayList.add(new LanguageModel("English", "en", false, Integer.valueOf(R.drawable.ic_english)));
        arrayList.add(new LanguageModel("Portugal", "pt", false, Integer.valueOf(R.drawable.ic_portugal)));
        arrayList.add(new LanguageModel("France", "fr", false, Integer.valueOf(R.drawable.ic_france)));
        arrayList.add(new LanguageModel("Spanish", "es", false, Integer.valueOf(R.drawable.ic_spanish)));
        arrayList.add(new LanguageModel("India", "hi", false, Integer.valueOf(R.drawable.ic_india)));
        if (getIntent().getStringExtra("SCREEN_MAIN") != null) {
            arrayList.add(new LanguageModel("Russian", "ru", false, Integer.valueOf(R.drawable.ic_russian)));
        }
        Log.e("", "setLanguageDefault: " + preLanguage);
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            SharedPreferences sharedPreferences2 = this.getSharedPreferences("setLanguageDefault", MODE_PRIVATE);
            Intrinsics.checkNotNull(sharedPreferences2);
            if (!sharedPreferences2.getBoolean("nativeLanguage", false)) {
                if (Intrinsics.areEqual((Object) preLanguage, (Object) arrayList.get(i).getIsoLanguage())) {
                    LanguageModel languageModel = arrayList.get(i);
                    languageModel.setCheck(true);
                    arrayList.remove(arrayList.get(i));
                    arrayList.add(0, languageModel);
                    break;
                }
            } else if (Intrinsics.areEqual((Object) preLanguage, (Object) arrayList.get(i).getIsoLanguage())) {
                arrayList.get(i).setCheck(true);
            }
            i++;
        }
        return arrayList;
    }

    @Override
    public void onClick(LanguageModel languageModel) {
        Intrinsics.checkNotNullParameter(languageModel, "data");
        LanguageAdapter languageAdapter = this.adapter;
        if (languageAdapter != null) {
            languageAdapter.setSelectLanguage(languageModel);
        }
        this.model = languageModel;
    }
}