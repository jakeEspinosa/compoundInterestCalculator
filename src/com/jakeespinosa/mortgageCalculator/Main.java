package com.jakeespinosa.mortgageCalculator;

public class Main {
    public static void main(String[] args) {

        int principal = (int)Console.readBoundNumber("Principal", 1, 100_000_000);
        double returnRate = Console.readBoundNumber("Estimated Return Rate", 1, 100);
        int compoundingFrequency = (int)Console.readBoundNumber("Compounding Frequency Per Year", 1, 365);
        int years = (int)Console.readBoundNumber("Years to Grow", 1, 100);

        var calculator = new InterestCalculator(principal, returnRate, compoundingFrequency, years);
        var reporter = new InterestReporter(calculator);

        double endValue = calculator.calculateValue();
        reporter.printValue(endValue);
        reporter.printValueByYear();
    }
}