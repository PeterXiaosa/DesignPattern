package com.peter.AbstractFactory;

public class SqlServerUser implements IUser{
    @Override
    public void addUser(String name) {
        System.out.println("SQL Server Add User : " + name);
    }

    @Override
    public void getUser(String name) {
        System.out.println("SQL Server Get User : " + name);
    }
}
