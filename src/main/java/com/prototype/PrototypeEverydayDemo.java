package main.java.com.prototype;

import main.java.com.state.State;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {
    public static void main(String[] args) {
        String sql = "Select * from movies";

        List<String> parameters = new ArrayList<>();

        parameters.add("star Wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getRecord());
        System.out.println(secondStatement.getParameters());


    }
}
