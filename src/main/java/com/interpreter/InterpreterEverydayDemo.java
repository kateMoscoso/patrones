package main.java.com.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    public static void main(String[] args){
        String input = "Lion, and tigers, and bears!";

        Pattern p = Pattern.compile("lion|cat|wolf|bear|tiger|liger");

        Matcher m = p.matcher(input);

        while(m.find()){
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
