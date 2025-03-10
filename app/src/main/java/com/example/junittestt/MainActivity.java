package com.example.junittestt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Calculator
        calculator = new Calculator();

        // Inisialisasi komponen UI
        firstNumberEditText = findViewById(R.id.editTextFirstNumber);
        secondNumberEditText = findViewById(R.id.editTextSecondNumber);
        resultTextView = findViewById(R.id.textViewResult);

        Button addButton = findViewById(R.id.buttonAdd);
        Button subtractButton = findViewById(R.id.buttonSubtract);
        Button multiplyButton = findViewById(R.id.buttonMultiply);
        Button divideButton = findViewById(R.id.buttonDivide);

        // Set up click listeners
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation(Calculator.OPERATION_ADD);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation(Calculator.OPERATION_SUBTRACT);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation(Calculator.OPERATION_MULTIPLY);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation(Calculator.OPERATION_DIVIDE);
            }
        });
    }

    private void performCalculation(String operation) {
        try {
            double firstNumber = Double.parseDouble(firstNumberEditText.getText().toString());
            double secondNumber = Double.parseDouble(secondNumberEditText.getText().toString());
            double result = 0;

            switch (operation) {
                case Calculator.OPERATION_ADD:
                    result = calculator.add(firstNumber, secondNumber);
                    break;
                case Calculator.OPERATION_SUBTRACT:
                    result = calculator.subtract(firstNumber, secondNumber);
                    break;
                case Calculator.OPERATION_MULTIPLY:
                    result = calculator.multiply(firstNumber, secondNumber);
                    break;
                case Calculator.OPERATION_DIVIDE:
                    result = calculator.divide(firstNumber, secondNumber);
                    break;
            }

            resultTextView.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultTextView.setText("Input tidak valid");
        } catch (ArithmeticException e) {
            resultTextView.setText(e.getMessage());
        }
    }
}
