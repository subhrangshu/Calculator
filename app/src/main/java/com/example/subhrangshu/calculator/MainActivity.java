package com.example.subhrangshu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button equal;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private TextView text;
    private TextView info;
    private TextView answer;
    private TextView result;
    private Double val1 = Double.NaN;
    private Double val2;
    private char action;
    private final char addition = '+';
    private final char substraction = '-';
    private final char multiplication = '*';
    private final char division = '/';
    private final char equals = '0';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = addition;
                result.setText(String.valueOf(val1) + "+");
                text.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = substraction;
                result.setText(String.valueOf(val1) + "-");
                text.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = multiplication;
                result.setText(String.valueOf(val1) + "*");
                text.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = division;
                result.setText(String.valueOf(val1) + "/");
                text.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action = division;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" +String.valueOf(val1)); //result.getText().toString() + String.valueOf(val2) + "=" +
                text.setText(null);
                text.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().length() > 0) {
                    CharSequence name = text.getText().toString();
                    text.setText(name.subSequence(0, name.length() - 1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    text.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    private void setupUIViews() {
        zero = (Button)findViewById(R.id.button0);
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        add = (Button)findViewById(R.id.buttonAdd);
        sub = (Button)findViewById(R.id.buttonSub);
        mul = (Button)findViewById(R.id.buttonMul);
        div = (Button)findViewById(R.id.buttonDiv);
        text = (TextView)findViewById(R.id.textView);
        equal = (Button)findViewById(R.id.buttonEq);
        clear = (Button)findViewById(R.id.buttonClr);
        result = (TextView)findViewById(R.id.textView2);
        info = (TextView)findViewById(R.id.textView3);
        answer = (TextView)findViewById(R.id.textView4);

    }
    private void compute() {
        if(!Double.isNaN(val1)) {
            val2 = Double.parseDouble(text.getText().toString());

            switch (action) {
                case addition:
                    val1 = val1 + val2;
                    break;
                case substraction:
                    val1 = val1 - val2;
                    break;
                case multiplication:
                    val1 = val1 * val2;
                    break;
                case division:
                    val1 = val1 / val2;
                    break;
                case equals:
                    break;
            }
        }
            else {
            val1 = Double.parseDouble(text.getText().toString());
        }
    }
}
