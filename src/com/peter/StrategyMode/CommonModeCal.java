package com.peter.StrategyMode;

public class CommonModeCal implements ICalculate{
    private double sum = 0;

    @Override
    public double calculateResult(double price, int amount) {
        sum += sum + price * amount;
        return sum;
    }
}
