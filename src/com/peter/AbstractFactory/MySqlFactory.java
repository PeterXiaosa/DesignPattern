package com.peter.AbstractFactory;

public class MySqlFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
}
