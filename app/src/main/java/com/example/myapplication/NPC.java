package com.example.myapplication;

import android.widget.TextView;

public class NPC implements Runnable, Printable{
    private int id = 0;
    private String state = "ожидает";

    public NPC(int id, String state) {
        this.id = id;
        this.state = state;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("NPC номер " + id + " " + state + ".\n");
    }

    @Override
    public void letsGO(TextView textView) {
        textView.append("NPC номер "+ id + " начал бежать.\n");
        state = "бежит";
    }
}
