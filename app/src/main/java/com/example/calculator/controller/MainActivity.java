package com.example.calculator.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;

import java.io.Serializable;
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
                if (text != null) {
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
                mTextViewResult.setText(text + "+");
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "-");
            }
        });

        mButtonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "×");
            }
        });

        mButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mTextViewResult.getText().toString();
                mTextViewResult.setText(text + "÷");
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
                    text += "=";
                    mTextViewResult.setText(parser(text));

                }
            }
        });
    }

    private String parser(String text) {
        BigDecimal temp1;
        BigDecimal temp2;
        BigDecimal temp = BigDecimal.valueOf(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '+') {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == '+' || text.charAt(j) == '-' || text.charAt(j) == '×' || text.charAt(j) == '=' || text.charAt(j) == '÷'‍)
                    {
                        temp1 = new BigDecimal(text.substring(0, i + 1));
                        temp2 = new BigDecimal(text.substring(0, i + 1));
//                        temp =BigDecimal.valueOf(temp1 + temp2) ;
                    }
                }

            }
        }
        return temp.toString();
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