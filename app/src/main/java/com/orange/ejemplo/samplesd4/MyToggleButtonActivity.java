package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyToggleButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ToggleButton mToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_toggle_button);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mToggleButton = (ToggleButton) findViewById(R.id.my_toggle_button);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mToggleButton.isChecked() ? mToggleButton.getTextOn() : mToggleButton.getTextOff(), Toast.LENGTH_SHORT).show();
    }
}
