package com.peter;

import com.peter.AbstractFactory.*;
import com.peter.StrategyMode.CalculateContext;
import com.peter.StrategyMode.CalculateFactory;
import com.peter.StrategyMode.ICalculate;

public class DesignPattern {

    public static void abstractFactory(){
        DBOperation operation = DBSelectFactory.getDBOperation("MySqlOperation");
        operation.getUser("peter");

        IFactory factory = new MySqlFactory();
        IUser user = factory.createUser();
        user.getUser("peter");

        ICalculate commonModeCal = CalculateFactory.createCalculateMode("discount");
        ;commonModeCal.calculateResult(25, 3);
        commonModeCal.calculateResult(10, 1);
        System.out.println(commonModeCal.calculateResult(20, 2));
    }

    public static void strategyMode(){
        CalculateContext calculateContext = new CalculateContext("DisCount");
        calculateContext.getResult(25, 3);
        calculateContext.getResult(10, 1);
        System.out.println(calculateContext.getResult(20, 2));
    }
}
