package com.ashikrabbani.calculator;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView result , ongoing;
    String getdata="";
    double oparendone,oparendTwo,result_of_calculation;
    String operation;
    String temp,temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result_textView);
        ongoing = findViewById(R.id.ongoing_textView);
    }

    public void button_0(View view)
    {
        getdata = getdata+"0";
        result.setText(getdata);
    }
    public void button_1(View view)
    {
        getdata = getdata+"1";
        result.setText(getdata);
    }
    public void button_2(View view)
    {
        getdata = getdata+"2";
        result.setText(getdata);
    }
    public void button_3(View view)
    {
        getdata = getdata+"3";
        result.setText(getdata);
    }
    public void button_4(View view)
    {
        getdata = getdata+"4";
        result.setText(getdata);
    }
    public void button_5(View view)
    {
        getdata = getdata+"5";
        result.setText(getdata);
    }
    public void button_6(View view)
    {
        getdata = getdata+"6";
        result.setText(getdata);
    }
    public void button_7(View view)
    {
        getdata = getdata+"7";
        result.setText(getdata);
    }
    public void button_8(View view)
    {
        getdata = getdata+"8";
        result.setText(getdata);
    }
    public void button_9(View view)
    {
        getdata = getdata+"9";
        result.setText(getdata);
    }
    public void button_dot(View view)
    {
        getdata = getdata+".";
        result.setText(getdata);
    }
    public void button_ac(View view)
    {
        ongoing.setText("");
        oparendone=0;
        oparendTwo=0;
        getdata="";
        result_of_calculation=0;
        result.setText("0");
    }
   // setting operations

    public void button_add(View view)
    {
        oparendone = Double.parseDouble(getdata);
        temp = getdata+"\n+";
        ongoing.setText(temp);
        getdata = "";
        operation = "addition";

    }

    public void button_sub(View view)
    {
        oparendone = Double.parseDouble(getdata);
        temp = getdata+"\n-";
        ongoing.setText(temp);
        getdata = "";
        operation = "substraction";
    }

    public void button_mul(View view)
    {
        oparendone = Double.parseDouble(getdata);
        temp = getdata+"\n*";
        ongoing.setText(temp);
        getdata = "";
        operation = "multiplication";
    }

    public void button_div(View view)
    {
        oparendone = Double.parseDouble(getdata);
        temp = getdata+"\n/";
        ongoing.setText(temp);
        getdata = "";
        operation = "divide";
    }

    public void button_equal(View view)
    {
        temp = temp+" "+getdata+"\n------------------------";
        ongoing.setText(temp);
        oparendTwo = Double.parseDouble(getdata);

        if (operation == "addition")
        {
            result_of_calculation = oparendone + oparendTwo;
            result.setText(Double.toString(result_of_calculation));
            getdata="";
            oparendTwo=0;
            oparendone=0;
            result_of_calculation=0;

        }
        else if (operation == "substraction")
        {
            result_of_calculation = oparendone - oparendTwo;
            result.setText(Double.toString(result_of_calculation));
            getdata="";
            oparendTwo=0;
            oparendone=0;

            result_of_calculation=0;

        }
        else if (operation == "multiplication")
        {
            result_of_calculation = oparendone * oparendTwo;
            result.setText(Double.toString(result_of_calculation));
            getdata="";
            oparendTwo=0;
            oparendone=0;


        }

        else if (operation == "divide")
        {
            result_of_calculation = oparendone / oparendTwo;
            result.setText(Double.toString(result_of_calculation));
            getdata="";
            oparendTwo=0;
            oparendone=0;
            result_of_calculation=0;

        }



    }



}
