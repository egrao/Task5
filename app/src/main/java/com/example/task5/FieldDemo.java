package com.example.task5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class FieldDemo extends AppCompatActivity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.fielddemo);

        EditText fld=(EditText)findViewById(R.id.field);
        fld.setText("Licensed under the Apache License, Version 2.0 " +
                "(the \"License\"); you may not use this file " +
                "except in compliance with the License. You may " +
                "obtain a copy of the License at " +
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}