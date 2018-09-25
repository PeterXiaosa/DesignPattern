package com.peter.StrategyMode;

public class CalculateFactory {

    public static ICalculate createCalculateMode(String type){
        ICalculate iCalculate = null;
        switch (type){
            case "common":
                iCalculate = new CommonModeCal();
                break;
            case "discount":
                iCalculate = new DisCountModeCal();
                break;
        }
        return iCalculate;
    }
}
