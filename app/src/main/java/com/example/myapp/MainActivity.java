package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static String res;
    Button submit, buttonC, button_his, button1,type_2, button_Equ, button2, button3, button4, button5, button6, button7, button8, button9, button0, button_addi, button_dot,button_dif,button_mul,button_div;
    TextView text;
    boolean Addition,subtraction,multiplication,division;
    double mValueOne, myValue2;
     public  static ArrayList<String> alist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textv);
        buttonC = findViewById(R.id.button_CLR);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        button0 = findViewById(R.id.button_0);
        type_2 = findViewById(R.id.type2);
        button_his = findViewById(R.id.history);
        button_dot = findViewById(R.id.button_dt);
        button_addi = findViewById(R.id.button_add);
        button_dif = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);
        button_Equ = findViewById(R.id.button_ans);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });
        button_addi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    Addition = true;
                    text.setText(null);
                }
            }
        });
        button_dif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    subtraction = true;
                    text.setText(null);
                }
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    multiplication = true;
                    text.setText(null);
                }
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null) {
                    text.setText("");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    division = true;
                    text.setText(null);
                }
            }
        });
        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myValue2 = Float.parseFloat(text.getText() + "");
                if (Addition == true) {
                    text.setText(mValueOne + myValue2 + "");
                    Addition = false;
                    String res = mValueOne + "+" + myValue2 + " = " + (mValueOne + myValue2);
                    alist.add(res);
                }
                if (subtraction == true) {
                    text.setText(mValueOne - myValue2 + "");
                    subtraction = false;
                    String res = mValueOne + "-" + myValue2 + " = " + (mValueOne - myValue2);
                    alist.add(res);
                }
                if (multiplication == true) {
                    text.setText(mValueOne * myValue2 + "");
                    multiplication = false;
                    String res = mValueOne + "*" + myValue2 + " = " + (mValueOne * myValue2);
                    alist.add(res);
                }
                if (division == true) {
                    text.setText(mValueOne / myValue2 + "");
                    division = false;
                    String res = mValueOne + "/" + myValue2 + " = " + (mValueOne / myValue2);
                    alist.add(res);
                }
            }

        });
        button_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    openactivity2();

                }
            }

        });
        type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    openactivity3();

                }
            }

        });

    }
    public void openactivity3(){
        Intent inte = new Intent(this,Activity3.class);
        startActivity(inte);
    }
    public void openactivity2(){
        String str = "";

        Intent intent = new Intent(this,Activity2.class);
        for (int i=0;i<alist.size();i++)
        {
          //  strArray2[i] =alist.get(i);
            str +=alist.get(i) + "\n";
        }
        startActivity(intent);
    }



}