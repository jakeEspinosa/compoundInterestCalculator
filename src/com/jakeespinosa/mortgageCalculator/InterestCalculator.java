package com.jakeespinosa.mortgageCalculator;

public class InterestCalculator {
    private final int PERCENT = 100;
    private int principal;
    private double returnRate;
    private int compoundingFrequency;
    private int years;

    public InterestCalculator(int principal, double returnRate, int compoundingFrequency, int years) {
        setPrincipal(principal);
        setReturnRate(returnRate);
        setCompoundingFrequency(compoundingFrequency);
        setYears(years);
    }
    public double calculateValue() {
        double value = principal *
                (Math.pow((1 + ((returnRate / PERCENT) / compoundingFrequency)), (compoundingFrequency * years)));
        return value;
    }

    private double calculateValue(int providedYear) {
        double value = principal *
                (Math.pow((1 + ((returnRate / PERCENT) / compoundingFrequency)), (compoundingFrequency * providedYear)));
        return value;
    }

    public double[] calculateValueByYear() {
        var values = new double[getYears()];
        for (int year = 1; year <= values.length; year++) {
            values[year - 1] = calculateValue(year);
        }
        return values;
    }

    private void setPrincipal(int principal) {
        this.principal = principal;
    }

    private void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    private void setCompoundingFrequency(int compoundingFrequency) {
        this.compoundingFrequency = compoundingFrequency;
    }

    private void setYears(int years) {
        this.years = years;
    }

    private int getYears(){
        return years;
    }
}