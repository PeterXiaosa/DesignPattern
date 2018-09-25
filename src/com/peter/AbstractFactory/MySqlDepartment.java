package com.peter.AbstractFactory;

public class MySqlDepartment implements IDepartment{
    @Override
    public void insert(String department) {
        System.out.println("MySql insert department : " + department);
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("MySql get department id : " + id);
    }
}
