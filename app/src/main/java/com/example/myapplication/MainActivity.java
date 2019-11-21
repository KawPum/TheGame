package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText = (TextView) findViewById(R.id.debugText);
        Unit Alexey = new Unit("Алексей", 100);
        Alexey.printInfo(debugText);
        Alexey.letsGO(debugText);

        Unit Nibba = new Robot("Nibba",550,400);
        Nibba.printInfo(debugText);
        Nibba.letsGO(debugText);

        Wizard Snape = new Wizard("Snape", 80, 60000);
        Snape.printInfo(debugText);
        Snape.letsGO(debugText);

        NPC npc = new NPC(0, "ожидает");
        npc.printInfo(debugText);
        npc.letsGO(debugText);
    }
}
