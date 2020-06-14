package com.example.assessment.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator_shusan extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,
            button6,button7,button8,button9,button_0,
            button_add,button_sub,button_multi,button_div,button_clr,button_dec,button_eq;
    EditText text;
    String display_num = "";
    float num1, num2;
    float result;
    boolean add, sub, multi, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        button_0 = findViewById(R.id.num0);
        button1 = findViewById(R.id.num1);
        button2 = findViewById(R.id.num2);
        button3 = findViewById(R.id.num3);
        button4 = findViewById(R.id.num4);
        button5 = findViewById(R.id.num5);
        button6 = findViewById(R.id.num6);
        button7 = findViewById(R.id.num7);
        button8 = findViewById(R.id.num8);
        button9 = findViewById(R.id.num9);
        button_add = findViewById(R.id.numadd);
        button_sub = findViewById(R.id.numsub);
        button_dec = findViewById(R.id.numdec);
        button_multi = findViewById(R.id.nummulti);
        button_div = findViewById(R.id.numdiv);
        button_clr = findViewById(R.id.numclear);
        button_eq = findViewById(R.id.num_eq);
        text = findViewById(R.id.text);

        button_0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button_dec.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_clr.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_multi.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_eq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.num0:
                display_num += 0;
                text.setText(display_num);
                break;
            case R.id.num1:
                display_num += 1;
                text.setText(display_num);
                break;
            case R.id.num2:
                display_num += 2;
                text.setText(display_num);
                break;
            case R.id.num3:
                display_num += 3;
                text.setText(display_num);
                break;
            case R.id.num4:
                display_num += 4;
                text.setText(display_num);
                break;
            case R.id.num5:
                display_num += 5;
                text.setText(display_num);
                break;
            case R.id.num6:
                display_num += 6;
                text.setText(display_num);
                break;
            case R.id.num7:
                display_num += 7;
                text.setText(display_num);
                break;
            case R.id.num8:
                display_num += 8;
                text.setText(display_num);
                break;
            case R.id.num9:
                display_num += 9;
                text.setText(display_num);
                break;
            case R.id.numclear:
                display_num = "";
                text.setText(display_num);
                break;
            case R.id.numadd:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Float.parseFloat(display_num + "");
                    add = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.numsub:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Float.parseFloat(display_num + "");
                    sub = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.nummulti:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Float.parseFloat(display_num + "");
                    multi = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.numdiv:
                if (text == null) {
                    text.setText("");
                } else {
                    num1 = Float.parseFloat(display_num + "");
                    div = true;
                    display_num = "";
                    text.setText(display_num);
                }
                break;
            case R.id.num_eq:
                if(display_num == ""){

                }else{
                    num2 = Integer.parseInt(display_num + "");
                    calculation(num1, num2);
                }

                break;

        }

    }

    private void calculation(float val1, float val2)
    {
        if(add == true){
            result = val1 + val2;
            text.setText(String.format("%.2f",result));
            add = false;
        }else if(sub == true){
            result = val1 - val2;
            text.setText(String.format("%.2f",result));
            sub = false;
        }else if(div == true){
            result = val1 / val2;
            text.setText(String.format("%.2f",result));
            div = false;
        }else if(multi == true){
            result = val1 * val2;
            text.setText(String.format("%.2f",result));
            multi = false;
        }
        display_num = result + "";
        num1 = Float.parseFloat(display_num);

    }
}
