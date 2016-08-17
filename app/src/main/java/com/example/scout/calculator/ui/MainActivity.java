package com.example.scout.calculator.ui;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.scout.calculator.R;

import java.util.ArrayList;

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
    @Bind(R.id.equationText) TextView mEquationText;

    private StringBuilder firstNum = new StringBuilder();
    private StringBuilder secondNum = new StringBuilder();
    private String firstNumString;
    private String secondNumString;
    private String mathObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);
        mButtonThree.setOnClickListener(this);
        mButtonFour.setOnClickListener(this);
        mButtonFive.setOnClickListener(this);
        mButtonSix.setOnClickListener(this);
        mButtonSeven.setOnClickListener(this);
        mButtonEight.setOnClickListener(this);
        mButtonNine.setOnClickListener(this);
        mButtonZero.setOnClickListener(this);
        mButtonPeriod.setOnClickListener(this);
        mButtonEquals.setOnClickListener(this);
        mButtonAdd.setOnClickListener(this);
        mButtonSub.setOnClickListener(this);
        mButtonMult.setOnClickListener(this);
        mButtonDivide.setOnClickListener(this);
        mButtonModulo.setOnClickListener(this);
        mButtonCase.setOnClickListener(this);
        mButtonClear.setOnClickListener(this);
        mEquationText.setOnClickListener(this);

        mEquationText.setText("0");
        mathObject = "z";
    }
    
    public void gatherEquation(String i) {
        if (mathObject.equals("z")) {
            buildFirstNum(i);
        } else {
            buildSecondNum(i);
        }
    }

    public void buildFirstNum(String i) {
        firstNum.append(i);
    }

    public void buildSecondNum(String i) {
        secondNum.append(i);
    }

    public void clearStats() {
        mathObject = "z";
        firstNum.setLength(0);
        secondNum.setLength(0);
    }

    public void processEquation() {
        double result = 0.00;
        int first = Integer.parseInt(firstNum.toString());
        int second = Integer.parseInt(secondNum.toString());

        if (mathObject.equals("add")) {
            result = first + second;
        } else if (mathObject.equals("sub")) {
            result = first - second;
        } else if (mathObject.equals("mul")) {
            result = first * second;
        } else if (mathObject.equals("div")) {
            result = first / second;
        } else if (mathObject.equals("z")){
            result = first;
        } else {

        }

        Log.d("MATH!", result + "");
        mathObject = "z";
        firstNum.setLength(0);
        secondNum.setLength(0);
    }

    @Override
    public void onClick(View view) {
        if (view == mButtonOne) {
            gatherEquation("1");
        }
        if (view == mButtonTwo) {
            gatherEquation("2");
        }
        if (view == mButtonThree) {
            gatherEquation("3");
        }
        if (view == mButtonFour) {
            gatherEquation("4");
        }
        if (view == mButtonFive) {
            gatherEquation("5");
        }
        if (view == mButtonSix) {
            gatherEquation("6");
        }
        if (view == mButtonSeven) {
            gatherEquation("7");
        }
        if (view == mButtonEight) {
            gatherEquation("8");
        }
        if (view == mButtonNine) {
            gatherEquation("9");
        }
        if (view == mButtonZero) {
            gatherEquation("0");
        }
        if (view == mButtonEquals) {
            processEquation();
        }
        if (view == mButtonAdd) {
            mathObject = "add";
        }
        if (view == mButtonSub) {
            mathObject = "sub";
        }
        if (view == mButtonMult) {
            mathObject = "mul";
        }
        if (view == mButtonDivide) {
            mathObject = "div";
        }
        if (view == mButtonClear) {
            clearStats();
        }
        if (view == mButtonCase) {

        }
        if (view == mButtonModulo) {

        }
    }
}
