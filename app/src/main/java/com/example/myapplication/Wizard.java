package com.example.myapplication;

import android.widget.TextView;

public class Wizard extends Unit implements Printable, Runnable {

    private int mana = 200;

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(getName() + " имеет " + mana + " очков магии.\n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        mana-=20;
        textPlace.append(getName() + " совершил телепортацию. Остаток магии " + mana + ".\n");
    }
}
