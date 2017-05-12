package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MySpinnerActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner mSpinner;

    private String[] data = {"Dog", "Cat", "Mouse"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mSpinner = (Spinner) findViewById(R.id.my_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,  mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }
}
