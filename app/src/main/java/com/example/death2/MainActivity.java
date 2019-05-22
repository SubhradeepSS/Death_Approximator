package com.example.death2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public float a=0;
    public int w=0;
    public int l=0;
    public EditText x;
    private EditText age;
    private EditText guess;
    private TextView compare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age=(EditText)findViewById(R.id.age);
        guess=(EditText)findViewById(R.id.guess);
        compare=(TextView)findViewById(R.id.compare);
        x=(EditText)findViewById(R.id.no);


    }
    public void compare(View v)
    {
        String ageStr=age.getText().toString();
        String guessStr=guess.getText().toString();
        String xStr=x.getText().toString();
        if(!"".equals(ageStr)&&!"".equals(guessStr)&&!"".equals(xStr)) {
            float agevalue = Float.parseFloat(ageStr);
            float guessvalue = Float.parseFloat(guessStr);
            float xvalue =Float.parseFloat(xStr);
            displayresult(agevalue,guessvalue,xvalue);
        }
    }
    private void displayresult(float agevalue,float guessvalue,float xvalue) {
        String label = "";
        a++;
        if(Float.compare(a,xvalue)<=0) {
            if (Float.compare(guessvalue, agevalue) < 0)
            {
                label = getString(R.string.less);
                l++;}
            else if (Float.compare(guessvalue, agevalue) > 0){
                label = getString(R.string.more);
                l++;}
            else{
                label = getString(R.string.exact);
                w++;}
        }
        else
            label=getString(R.string.lost);
        String s="Success :";
        String f="Fail :";

        compare.setText(label+"\n"+s+w+"\n"+f+l);

    }

}

