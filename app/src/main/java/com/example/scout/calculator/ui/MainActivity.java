package com.example.scout.calculator.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.scout.calculator.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.buttonAdd) TextView mButtonAdd;
    @Bind(R.id.buttonCase) TextView mButtonCase;
    @Bind(R.id.buttonClear) TextView mButtonClear;
    @Bind(R.id.buttonDivide) TextView  mButtonDivide;
    @Bind(R.id.buttonEight) TextView mButtonEight;
    @Bind(R.id.buttonEquals) TextView mButtonEquals;
    @Bind(R.id.buttonFive) TextView mButtonFive;
    @Bind(R.id.buttonFour) TextView mButtonFour;
    @Bind(R.id.buttonModulo) TextView mButtonModulo;
    @Bind(R.id.buttonMult) TextView mButtonMult;
    @Bind(R.id.buttonNine) TextView mButtonNine;
    @Bind(R.id.buttonOne) TextView mButtonOne;
    @Bind(R.id.buttonPeriod) TextView mButtonPeriod;
    @Bind(R.id.buttonSeven) TextView mButtonSeven;
    @Bind(R.id.buttonSix) TextView mButtonSix;
    @Bind(R.id.buttonSub) TextView mButtonSub;
    @Bind(R.id.buttonThree) TextView mButtonThree;
    @Bind(R.id.buttonTwo) TextView mButtonTwo;
    @Bind(R.id.buttonZero) TextView mButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    public void onClick(View view) {
        if (view == mButtonOne) {

        }
        if (view == mButtonThree) {

        }
        if (view == mButtonThree) {

        }
        if (view == mButtonFour) {

        }
        if (view == mButtonFive) {

        }
        if (view == mButtonSix) {

        }
        if (view == mButtonSeven) {

        }
        if (view == mButtonEight) {

        }
        if (view == mButtonNine) {

        }
        if (view == mButtonZero) {

        }
        if (view == mButtonEquals) {

        }
        if (view == mButtonAdd) {

        }
        if (view == mButtonSub) {

        }
        if (view == mButtonMult) {

        }
        if (view == mButtonDivide) {

        }
        if (view == mButtonClear) {

        }
        if (view == mButtonCase) {

        }
        if (view == mButtonModulo) {

        }
    }
}
