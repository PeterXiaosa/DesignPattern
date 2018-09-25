package com.peter.StrategyMode;

public class CalculateContext {
    private ICalculate iCalculate;

    private String packagePath = "com.peter.StrategyMode.";

    public CalculateContext(String type) {
        String className = packagePath + type + "ModeCal";
        try {
            iCalculate = (ICalculate)Class.forName(className).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public double getResult(double price, int amount){
        return iCalculate.calculateResult(price, amount);
    }
}
