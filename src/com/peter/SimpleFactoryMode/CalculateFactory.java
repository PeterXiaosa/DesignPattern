package com.peter.SimpleFactoryMode;

public class CalculateFactory {

    public static Operation getOperation(String operation){
        Operation operation1 = null;
        switch (operation){
            case "+":
                operation1 = new Add();
                break;
            case "-":
                operation1 = new Substract();
                break;
            case "*":
                operation1 = new Multiply();
                break;
            case "/":
                operation1 = new Divide();
                break;
        }
        return operation1;
    }
}
