package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyDatePickerActivity extends AppCompatActivity implements View.OnClickListener {
    private  DatePicker mDatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_date_picker);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        mDatePicker =  (DatePicker) findViewById(R.id.my_date_picker);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(mDatePicker.getDayOfMonth());
        sb.append("/");
        sb.append(mDatePicker.getMonth());
        sb.append("/");
        sb.append(mDatePicker.getYear());
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}
