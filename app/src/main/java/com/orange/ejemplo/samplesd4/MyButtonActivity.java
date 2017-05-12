package com.orange.ejemplo.samplesd4;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.orange.ejemplo.samplesd4.MainActivity.TITLE;

public class MyButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private String [] actions = {"OK", "Cancel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_button);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITLE));
        Button button = (Button) findViewById(R.id.my_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog alert = new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setMessage("Mensaje")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MyButtonActivity.this, "Positive Message", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MyButtonActivity.this, "Negative Message", Toast.LENGTH_SHORT).show();;
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MyButtonActivity.this, "Neutral Message", Toast.LENGTH_SHORT).show();;
                    }
                }).create();
        alert.show();
    }
}
