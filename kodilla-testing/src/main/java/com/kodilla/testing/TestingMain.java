package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int number1 = 13, number2 = 7;
        int calcResult = calculator.add(number1, number2);

        if (calcResult == number1 + number2) {
            System.out.println("Calc: add OK");
        } else {
            System.out.println("Calc: add Error!");
        }

        calcResult = calculator.subtract(number1, number2);

        if (calcResult == number1 - number2) {
            System.out.println("Calc: subtract OK");
        } else {
            System.out.println("Calc: subtract Error!");
        }
    }
}