package com.peter.AbstractFactory;

public class MySqlUser implements IUser{
    @Override
    public void addUser(String name) {
        System.out.println("MySql Add User : " + name);
    }

    @Override
    public void getUser(String name) {
        System.out.println("MySql Get User : " + name);
    }
}
