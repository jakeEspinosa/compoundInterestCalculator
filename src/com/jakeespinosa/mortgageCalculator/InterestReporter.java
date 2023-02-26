package com.jakeespinosa.mortgageCalculator;

import java.text.NumberFormat;

public class InterestReporter {
    private InterestCalculator calculator;
    private NumberFormat currency;

    public InterestReporter(InterestCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printValue(double value) {
        String formattedValue = NumberFormat.getCurrencyInstance().format(value);
        System.out.println();
        System.out.println("----------");
        System.out.println();
        System.out.print("End Value: ");
        System.out.println(formattedValue);
    }

    public void printValueByYear() {
        System.out.println();
        System.out.println("----------");
        int year = 1;
        for(double value : calculator.calculateValueByYear()) {
            System.out.println("Year " + year + ": " + currency.format(value));
            year++;
        }
    }
}