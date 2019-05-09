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

        int calcResult = calculator.add(13, 7);

        if (calcResult == 20) {
            System.out.println("Calc: add OK");
        } else {
            System.out.println("Calc: add Error!");
        }

        calcResult = calculator.subtract(13, 7);

        if (calcResult == 6) {
            System.out.println("Calc: subtract OK");
        } else {
            System.out.println("Calc: subtract Error!");
        }
    }
}