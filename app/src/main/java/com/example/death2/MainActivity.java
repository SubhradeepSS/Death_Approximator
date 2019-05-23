package com.example.death2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public float b=0;
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
        LinearLayout t;
        t=(LinearLayout)findViewById((R.id.activity_main));
        float a=Math.abs(agevalue-guessvalue);
        b++;
        if((a<=100&&a>90))
            t.setBackgroundColor(Color.parseColor("#f44336"));
        else if((a<=90&&a>80))
            t.setBackgroundColor(Color.parseColor("#ef5350"));
        else if((a<=80&&a>70))
            t.setBackgroundColor(Color.parseColor("#e57373"));
        else if((a<=70&&a>60))
            t.setBackgroundColor(Color.parseColor("#ffcdd2"));
        else if((a<=60&&a>50))
            t.setBackgroundColor(Color.parseColor("#ffebee"));
        else if((a<=50&&a>40))
            t.setBackgroundColor(Color.parseColor("#c8e6c9"));
        else if((a<=40&&a>30))
            t.setBackgroundColor(Color.parseColor("#aed581"));
        else if((a<=30&&a>20))
            t.setBackgroundColor(Color.parseColor("#8bc34a"));
        else if((a<=20&&a>10))
            t.setBackgroundColor(Color.parseColor("#66bb6a"));
        else if((a<=10&&a>0))
            t.setBackgroundColor(Color.parseColor("#8bc34a"));
        else
            t.setBackgroundColor(Color.parseColor("#4caf50"));
        if(Float.compare(b,xvalue)<0) {
            if (Float.compare(guessvalue, agevalue) < 0)
            {
                label = getString(R.string.less);
                l++;

            }
            else if (Float.compare(guessvalue, agevalue) > 0){
                label = getString(R.string.more);
                l++;

            }
            else{
                label = getString(R.string.exact);
                w++;}

            if((a<=100&&a>90))
                t.setBackgroundColor(Color.parseColor("#f44336"));
            else if((a<=90&&a>80))
                t.setBackgroundColor(Color.parseColor("#ef5350"));
            else if((a<=80&&a>70))
                t.setBackgroundColor(Color.parseColor("#e57373"));
            else if((a<=70&&a>60))
                t.setBackgroundColor(Color.parseColor("#ffcdd2"));
            else if((a<=60&&a>50))
                t.setBackgroundColor(Color.parseColor("#ffebee"));
            else if((a<=50&&a>40))
                t.setBackgroundColor(Color.parseColor("#c8e6c9"));
            else if((a<=40&&a>30))
                t.setBackgroundColor(Color.parseColor("#aed581"));
            else if((a<=30&&a>20))
                t.setBackgroundColor(Color.parseColor("#8bc34a"));
            else if((a<=20&&a>10))
                t.setBackgroundColor(Color.parseColor("#66bb6a"));
            else if((a<=10&&a>0))
                t.setBackgroundColor(Color.parseColor("#8bc34a"));
            else
                t.setBackgroundColor(Color.parseColor("#4caf50"));
        }
        else{
            label=getString(R.string.lost);
        t.setBackgroundColor(Color.parseColor("#bdbdbd"));}
        String s="Success :";
        String f="Fail :";

        compare.setText(label+"\n"+s+w+"\n"+f+l);

    }

}

