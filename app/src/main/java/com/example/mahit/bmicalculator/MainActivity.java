package com.example.mahit.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonclicked(View v){
        EditText eweight=findViewById(R.id.editText);
        EditText eheight=findViewById(R.id.editText2);
        TextView tans=findViewById(R.id.textView2);

        double weight = Double.parseDouble(eweight.getText().toString());
        double height =Double.parseDouble(eheight.getText().toString());
        double BMI = weight/(height*height);

        tans.setText(Double.toString(BMI));

    }
}
