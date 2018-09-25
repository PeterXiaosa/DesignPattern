package com.peter.StrategyMode;

public class DisCountModeCal implements ICalculate{
    private double sum = 0;

    @Override
    public double calculateResult(double price, int amount) {
        sum += sum + price * amount;
        System.out.println("Total Price : " + sum);
        return sum * 0.8;
    }
}
