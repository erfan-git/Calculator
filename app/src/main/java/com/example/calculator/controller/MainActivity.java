package com.example.calculator.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.calculator.R;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_BUNDLE_TEXT_VIEW = "key bundle text view";
    private ImageButton mButtonAdd;
    private ImageButton mButtonSub;
    private ImageButton mButtonDivision;
    private ImageButton mButtonMult;
    private ImageButton mButtonEqual;
    private Button mButtonDot;
    private ImageButton mButtonZero;
    private ImageButton mButtonOne;
    private ImageButton mButtonTwo;
    private ImageButton mButtonThree;
    private ImageButton mButtonFour;
    private ImageButton mButtonFive;
    private ImageButton mButtonSix;
    private ImageButton mButtonSeven;
    private ImageButton mButtonEight;
    private ImageButton mButtonNine;
    private ImageButton mButtonDelete;
    private ImageButton mButtonReset;
    private TextView mTextViewResult;

    private String operand = "+-=×÷";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViews();
        if (savedInstanceState != null) {
            mTextViewResult.setText(savedInstanceState.getString(KEY_BUNDLE_TEXT_VIEW));
        }
        setClickListeners();

    }

    private void setClickListeners() {
        mButtonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if (text != null && !(operand.contains(String.valueOf(text.charAt(text.length()-1)))) ) {
                    mTextViewResult.setText(text + "0");
                }
//                    Toast.makeText(MainActivity.this,"your username or password is false !!!",Toast.LENGTH_LONG).show();
            }
        });

        mButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "1");
            }
        });

        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "2");
            }
        });

        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "3");
            }
        });

        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "4");
            }
        });

        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "5");
            }
        });

        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "6");
            }
        });

        mButtonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "7");
            }
        });

        mButtonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "8");
            }
        });

        mButtonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "9");
            }
        });

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if ( !(operand.contains(String.valueOf(text.charAt(text.length()-1))))){
                    mTextViewResult.setText(text + "+");
                }
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if ( !(operand.contains(String.valueOf(text.charAt(text.length()-1))))){
                    mTextViewResult.setText(text + "-");
                }
            }
        });

        mButtonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if ( !(operand.contains(String.valueOf(text.charAt(text.length()-1))))){
                    mTextViewResult.setText(text + "×");
                }

            }
        });

        mButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if (!(operand.contains(String.valueOf(text.charAt(text.length()-1)))) && text.charAt(text.length()-1) != 0){
                    mTextViewResult.setText(text + "÷");
                }

            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + ".");
            }
        });

        mButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if (text.length() != 0 && text != null) {
                    mTextViewResult.setText(text.substring(0, text.length() - 1));
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if (text.length() != 0 && text != null) {
                    mTextViewResult.setText("");
                }
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                if (text.length() != 0 && text != null) {
                    text =  text+ "= ";
                    mTextViewResult.setText(parser(text).substring(0,parser(text).length()-1));

                }
            }
        });
    }

    /**
     *
     * @param text of textView
     * @return result of operation
     */
    private String parser(String text) {
//        char[] operand ={'+','-','=','×','÷'};
        String operand = "+-=×÷";

//        BigDecimal temp = new BigDecimal(0);
//        BigDecimal temp1 = new BigDecimal(0);
//        BigDecimal temp2 = new BigDecimal(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '+') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (operand.contains(String.valueOf(text.charAt(j)))) {
                        Double obj = Double.valueOf(text.substring(0, i ));

                        Double obj1 = Double.valueOf(text.substring(i+1, j));

                        Double temp = obj + obj1;

                        text = temp + text.substring(j);
                    }
                }
            } else if (text.charAt(i) == '-') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (operand.contains(String.valueOf(text.charAt(j)))) {
                        Double obj = Double.valueOf(text.substring(0, i));

                        Double obj1 = Double.valueOf(text.substring(i+1, j));

                        Double temp = obj - obj1;

                        text = temp + text.substring(j);
                    }
                }
            } else if (text.charAt(i) == '×') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (operand.contains(String.valueOf(text.charAt(j)))) {
                        Double obj = Double.valueOf(text.substring(0, i));

                        Double obj1 = Double.valueOf(text.substring(i+1, j));

                        Double temp = 1.0;
                        temp = obj * obj1;
                        text = temp + text.substring(j);
                    }
                }
            } else if (text.charAt(i) == '÷') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (operand.contains(String.valueOf(text.charAt(j)))) {
                        Double obj = Double.valueOf(text.substring(0, i));

                        Double obj1 = Double.valueOf(text.substring(i+1, j));

                        Double temp = obj / obj1;

                        text = temp + text.substring(j);
                    }
                }
            }

        }
//        Double checkNumber = Double.valueOf(text);
//        if (checkNumber - )
        return text;
    }

    private void findAllViews() {
        mButtonAdd = findViewById(R.id.imageButton_add);
        mButtonDivision = findViewById(R.id.imageButton_division);
        mButtonSub = findViewById(R.id.imageButton_sub);
        mButtonMult = findViewById(R.id.imageButton_mult);
        mButtonDot = findViewById(R.id.button_point);
        mButtonEqual = findViewById(R.id.imageButton_equal);
        mButtonDelete = findViewById(R.id.imageButton_delete);
        mButtonReset = findViewById(R.id.imageButton_reset);
        mButtonOne = findViewById(R.id.imageButton_one);
        mButtonTwo = findViewById(R.id.imageButton_two);
        mButtonThree = findViewById(R.id.imageButton_three);
        mButtonFour = findViewById(R.id.imageButton_four);
        mButtonFive = findViewById(R.id.imageButton_five);
        mButtonSix = findViewById(R.id.imageButton_six);
        mButtonSeven = findViewById(R.id.imageButton_seven);
        mButtonEight = findViewById(R.id.imageButton_eight);
        mButtonNine = findViewById(R.id.imageButton_nine);
        mButtonZero = findViewById(R.id.imageButton_zero);
        mTextViewResult = findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_BUNDLE_TEXT_VIEW, mTextViewResult.getText().toString());
    }
}