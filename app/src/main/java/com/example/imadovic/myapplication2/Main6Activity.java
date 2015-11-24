package com.example.imadovic.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void clickButton(View view) {
        Intent intent = new Intent(Main6Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}
