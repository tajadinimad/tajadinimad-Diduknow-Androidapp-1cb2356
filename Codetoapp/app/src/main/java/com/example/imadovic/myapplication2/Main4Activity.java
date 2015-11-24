package com.example.imadovic.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Previous(View view) {
        Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void Next(View view) {
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }

    public void clickButton(View view) {

        if (view.getId() == R.id.previous) {
            Previous(view);
        } else if (view.getId() == R.id.next) {
            Next(view);
        }
    }
}
