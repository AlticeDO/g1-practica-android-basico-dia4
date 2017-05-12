package com.orange.ejemplo.samplesd4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TITLE = "TITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.myTextViewButton).setOnClickListener(this);
        findViewById(R.id.myImageViewButton).setOnClickListener(this);
        findViewById(R.id.myEditTextButton).setOnClickListener(this);
        findViewById(R.id.myAutoCompleteTextViewButton).setOnClickListener(this);
        findViewById(R.id.myButtonButton).setOnClickListener(this);
        findViewById(R.id.myImageButtonButton).setOnClickListener(this);
        findViewById(R.id.myCheckboxButton).setOnClickListener(this);
        findViewById(R.id.myToggleButtonButton).setOnClickListener(this);
        findViewById(R.id.myRadioButtonButton).setOnClickListener(this);
        findViewById(R.id.myRadioGroupButton).setOnClickListener(this);
        findViewById(R.id.myProgressbarButton).setOnClickListener(this);
        findViewById(R.id.mySpinnerButton).setOnClickListener(this);
        findViewById(R.id.myTimePickerButton).setOnClickListener(this);
        findViewById(R.id.myDatePickerButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.myTextViewButton:
                intent = new Intent(this, MyTextViewActivity.class);
                break;
            case R.id.myImageViewButton:
                intent = new Intent(this, MyImageViewActivity.class);
                break;
            case R.id.myEditTextButton:
                intent = new Intent(this, MyEditTextActivity.class);
                break;
            case R.id.myAutoCompleteTextViewButton:
                intent = new Intent(this, MyAutoCompleteTextViewActivity.class);
                break;
            case R.id.myButtonButton:
                intent = new Intent(this, MyButtonActivity.class);
                break;
            case R.id.myImageButtonButton:
                intent = new Intent(this, MyImageButtonActivity.class);
                break;
            case R.id.myCheckboxButton:
                intent = new Intent(this, MyCheckboxActivity.class);
                break;
            case R.id.myToggleButtonButton:
                intent = new Intent(this, MyToggleButtonActivity.class);
                break;
            case R.id.myRadioButtonButton:
                intent = new Intent(this, MyRadioButtonActivity.class);
                break;
            case R.id.myRadioGroupButton:
                intent = new Intent(this, MyRadioGroupActivity.class);
                break;
            case R.id.myProgressbarButton:
                intent = new Intent(this, MyProgressBarActivity.class);
                break;
            case R.id.mySpinnerButton:
                intent = new Intent(this, MySpinnerActivity.class);
                break;
            case R.id.myTimePickerButton:
                intent = new Intent(this, MyTimePickerActivity.class);
                break;
            case R.id.myDatePickerButton:
                intent = new Intent(this, MyDatePickerActivity.class);
                break;
            default:
                break;
        }
        if (intent != null) {
            if (view instanceof Button){
                intent.putExtra("TITLE", ((Button) view).getText());
            }
            startActivity(intent);
        }
    }
}
