package com.gn4k.boodpressure.ui.tutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.gn4k.boodpressure.R;

import java.util.ArrayList;

public class IntroAdapter extends RecyclerView.Adapter<IntroAdapter.IntroAdapterHolder> {
    Context context;
    private ArrayList<IntroModel> mHelpIntroModel;

    public IntroAdapter(ArrayList<IntroModel> arrayList, Context context2) {
        this.mHelpIntroModel = arrayList;
        this.context = context2;
    }

    public IntroAdapterHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new IntroAdapterHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_guid, viewGroup, false));
    }

    public void onBindViewHolder(IntroAdapterHolder introAdapterHolder, int i) {
        IntroModel introModel = this.mHelpIntroModel.get(i);
        Glide.with(this.context).load(Integer.valueOf(introModel.getImg())).into(introAdapterHolder.img_guide);
        introAdapterHolder.tv_title.setText(introModel.getTitle());
        introAdapterHolder.tv_contnet.setText(introModel.getContent());
    }

    public int getItemCount() {
        ArrayList<IntroModel> arrayList = this.mHelpIntroModel;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public class IntroAdapterHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */
        public ImageView img_guide;
        /* access modifiers changed from: private */
        public TextView tv_contnet;
        /* access modifiers changed from: private */
        public TextView tv_title;

        public IntroAdapterHolder(View view) {
            super(view);
            this.img_guide = (ImageView) view.findViewById(R.id.img_guide);
            this.tv_title = (TextView) view.findViewById(R.id.tv_title);
            this.tv_contnet = (TextView) view.findViewById(R.id.tv_content);
        }
    }
}