package com.RandomNumber;


public class Main {
    public static void main(String[] args) {
        // Create an instance of RangeRandomNumberGenerator with a range of 1 to 100
        RangeRandomNumberGenerator rng = new RangeRandomNumberGenerator(1, 100);

        // Generate and print a random number
        int randomNumber = rng.generate();
        System.out.println("Generated random number: " + randomNumber);

        // Optionally, we can change the range
        rng.setMinValue(50);
        rng.setMaxValue(150);

        // Generate and print another random number with the new range
        int randomNumber2 = rng.generate();
        System.out.println("Generated random number with new range: " + randomNumber2);
    }
}

