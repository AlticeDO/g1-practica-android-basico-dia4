package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyAutoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_auto_complete_text_view);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));


        String[] data = {"Cat", "Dog", "Mouse"};
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.select_dialog_item, data));
        // Number of Chars to Trigger Lookup
        autoCompleteTextView.setThreshold(1);
    }
}
