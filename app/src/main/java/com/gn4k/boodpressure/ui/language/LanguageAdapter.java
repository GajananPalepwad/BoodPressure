package com.gn4k.boodpressure.ui.language;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.gn4k.boodpressure.R;
import com.gn4k.boodpressure.data.model.LanguageModel;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public IClickLanguage iClickLanguage;
    private List<LanguageModel> lists;

    public LanguageAdapter(Context context2, List<LanguageModel> list, IClickLanguage iClickLanguage2) {
        this.context = context2;
        this.lists = list;
        this.iClickLanguage = iClickLanguage2;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new LanguageViewHolder(LayoutInflater.from(this.context).inflate(R.layout.layout_item_language, viewGroup, false));
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final LanguageModel languageModel = this.lists.get(i);
        if (viewHolder instanceof LanguageViewHolder) {
            LanguageViewHolder languageViewHolder = (LanguageViewHolder) viewHolder;
            languageViewHolder.bind(languageModel);
            languageViewHolder.relayLanguage.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    LanguageAdapter.this.iClickLanguage.onClick(languageModel);
                }
            });
            languageViewHolder.rbActive.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    LanguageAdapter.this.iClickLanguage.onClick(languageModel);
                }
            });
            languageViewHolder.rbActive.setChecked(languageModel.isCheck());
        }
    }

    public int getItemCount() {
        List<LanguageModel> list = this.lists;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        RadioButton rbActive;
        RelativeLayout relayLanguage;
        TextView tvTitle;

        public LanguageViewHolder(View view) {
            super(view);
            this.ivAvatar = (ImageView) view.findViewById(R.id.img_avatar);
            this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            this.relayLanguage = (RelativeLayout) view.findViewById(R.id.relay_language);
            this.rbActive = (RadioButton) view.findViewById(R.id.rb_active);
        }

        public void bind(LanguageModel languageModel) {
            this.ivAvatar.setImageDrawable(LanguageAdapter.this.context.getDrawable(languageModel.getImage().intValue()));
            this.tvTitle.setText(languageModel.getLanguageName());
        }
    }

    public void setSelectLanguage(LanguageModel languageModel) {
        for (LanguageModel next : this.lists) {
            if (next.getLanguageName().equals(languageModel.getLanguageName())) {
                next.setCheck(true);
            } else {
                next.setCheck(false);
            }
        }
        notifyDataSetChanged();
    }
}
