package com.peter.AbstractFactory;

public class DataAccess {
    private static String  db = "SqlServer";
    private static String packagePath = "com.peter.AbstractFactory.";

    public static IUser createUser(){
        IUser iUser = null;
        String className = packagePath + db + "User";
        try {
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return iUser;
    }

    public static IDepartment createDepartment(){
        IDepartment iUser = null;
        String className = packagePath + db + "Department";
        try {
            iUser = (IDepartment) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return iUser;
    }
}
