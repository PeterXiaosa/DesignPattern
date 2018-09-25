package com.peter.AbstractFactory;

public class MySqlOperation implements DBOperation{
    @Override
    public void addUser(String name) {
        System.out.println("MySQL Add User : " + name);
    }

    @Override
    public void getUser(String name) {
        System.out.println("MySQL Server Add User : " + name);
    }
}
