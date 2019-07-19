package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    double result;

    @Autowired
    Display display;

    double add(double a, double b) {
        result = a + b;
        display.displayValue(result);
        return result;
    }

    double sub(double a, double b) {
        result = a - b;
        display.displayValue(result);
        return result;
    }

    double mul(double a, double b) {
        result = a * b;
        display.displayValue(result);
        return result;
    }

    double div(double a, double b) {
        if (b > 0) {
            result = a / b;
        }
        display.displayValue(result);
        return result;
    }
}
