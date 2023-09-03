package com.gn4k.boodpressure.ui.tutorial;


public class IntroModel {
    private String content;
    private int img;
    private String title;

    public IntroModel(int i, String str, String str2) {
        this.img = i;
        this.title = str;
        this.content = str2;
    }

    public int getImg() {
        return this.img;
    }

    public void setImg(int i) {
        this.img = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }
}