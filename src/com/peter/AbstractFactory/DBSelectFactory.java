package com.peter.AbstractFactory;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

public class DBSelectFactory {
    public static DBOperation getDBOperation(String dbType){
        DBOperation operation = null;
        try {
            operation = (DBOperation)Class.forName("com.peter.AbstractFactory." + dbType).newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return operation;
    }
}
