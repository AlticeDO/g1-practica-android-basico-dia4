package com.orange.ejemplo.samplesd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyImageButtonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_image_button);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        findViewById(R.id.my_image_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Image Button clicked", Toast.LENGTH_SHORT).show();
    }
}
