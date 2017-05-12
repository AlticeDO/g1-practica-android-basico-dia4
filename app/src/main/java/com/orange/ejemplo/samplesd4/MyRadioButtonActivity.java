package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyRadioButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_button);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mRadioButton = (RadioButton) findViewById(R.id.my_radio_button);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "RadioButton was " + (mRadioButton.isChecked() ? "checked" : "not Checked"), Toast.LENGTH_SHORT).show();
        mRadioButton.setChecked(false);
    }
}
