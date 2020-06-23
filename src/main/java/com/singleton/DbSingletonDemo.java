package main.java.com.singleton;

import java.net.StandardSocketOptions;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main (String [] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();

        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
        Statement sta;
        try {
            sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID Int, StreetName VARCHAR(20),"+
                    " City VARCHAR(20))");
            System.out.println("Table created");
            sta.close();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
