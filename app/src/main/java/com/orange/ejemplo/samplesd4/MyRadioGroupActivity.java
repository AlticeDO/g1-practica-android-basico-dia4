package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyRadioGroupActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioGroup mRadioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_group);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mRadioGroup = (RadioGroup) findViewById(R.id.my_radio_group);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        RadioButton selected = (RadioButton) findViewById(mRadioGroup.getCheckedRadioButtonId());
        if (selected != null) {
            Toast.makeText(this, "Selected: " + selected.getText(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please select an animal", Toast.LENGTH_SHORT).show();
        }
    }
}
