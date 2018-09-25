package com.peter.AbstractFactory;

public class SqlServerDepartment implements IDepartment{
    @Override
    public void insert(String department) {
        System.out.println("SQL Server insert department : " + department);
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("SQL Server get department : " + id);
    }
}
