package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_text_view);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
    }
}
