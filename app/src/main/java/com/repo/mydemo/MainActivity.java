package com.repo.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.repo.mylibrary.Calc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10, b = 20; // Initialize value to variable

        Calc calc = new Calc();// Create Object of the Library class

        Log.e("Addition", calc.addition(a, b) + ""); // Use method od the Library class
        Log.e("Substraction", calc.substraction(a, b) + "");
        Log.e("Multiplication", calc.multiplication(a, b) + "");
        Log.e("Division", calc.division(a, b) + "");
    }
}
