package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyCheckboxActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox mMyCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_checkbox);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mMyCheckbox = (CheckBox) findViewById(R.id.my_checkbox);
        findViewById(R.id.my_checkbox_status_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mMyCheckbox.isChecked() ? "Checked" : "Not Checked", Toast.LENGTH_SHORT).show();
    }
}
