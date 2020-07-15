package main.java.com.memento;

import javax.imageio.IIOException;
import java.io.*;

public class MementoEverydayDemo {

    private static Employee deserialize(){
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        return emp;
    }
    public static void serialize (Employee emp){
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i){
            i.printStackTrace();
        }
    }
    public static void main (String[] args) {
        Employee emp = new Employee();
        emp.setName("Joe");
        emp.setAddress("Calle illescas 34");
        emp.setPhone("555666555");

        serialize(emp);

        Employee newEmp = deserialize();
    }
    }
