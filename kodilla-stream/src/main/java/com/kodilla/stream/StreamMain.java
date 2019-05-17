package com.kodilla.stream;

import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        PoemBeautifier beautifier = new PoemBeautifier();

        System.out.println(beautifier.beautify("DEF", text -> "ABC"+text));
        System.out.println(beautifier.beautify("XYZ", text -> text+"ABC"));
        System.out.println(beautifier.beautify("Ala ma kota", text -> text.toUpperCase()));
        System.out.println(beautifier.beautify("MALA ALA MA KOTA", text -> text.toLowerCase()));
        System.out.println(beautifier.beautify("Last one", text -> "***"+text+"***"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}