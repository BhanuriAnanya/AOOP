package com.RandomNumber;

import java.util.Random;

public class RangeRandomNumberGenerator extends RandomNumberGenerator {
    private int minValue;
    private int maxValue;
    private Random random;

    // Constructor
    public RangeRandomNumberGenerator(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.random = new Random();
    }

    @Override
    public int generate() {
        return random.nextInt((maxValue - minValue) + 1) + minValue;
    }

    // Getters and setters
    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}
