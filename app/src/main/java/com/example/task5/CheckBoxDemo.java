package com.example.task5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxDemo extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cb;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.checkboxdemo);

        cb= (CheckBox)findViewById(R.id.checkdemo);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {
        if (isChecked) {
            cb.setText("This checkbox is: checked");
        }
        else {
            cb.setText("This checkbox is: unchecked");
        }
    }
}
