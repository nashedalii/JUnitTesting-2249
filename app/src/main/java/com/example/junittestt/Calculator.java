package com.example.junittestt;

public class Calculator {
    public static final String OPERATION_ADD = "ADD";
    public static final String OPERATION_SUBTRACT = "SUBTRACT";
    public static final String OPERATION_MULTIPLY = "MULTIPLY";
    public static final String OPERATION_DIVIDE = "DIVIDE";

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }
}
