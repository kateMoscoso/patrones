package main.java.com.memento;

public class MementoDemo {
    public static void main (String args[]){

        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("John Wick");
        emp.setAddress("");
        emp.setPhone("2223334444");

        System.out.println("Emmployee before save");

        caretaker.save(emp);

        emp.setPhone("2546896660");

        caretaker.save(emp);

        System.out.println("Employee after changed phone number save: " + emp);

        emp.setPhone("333444"); // no se llama al save

        caretaker.revert(emp);

        System.out.println("Reverts to last save point" + emp);

        caretaker.revert(emp);

        System.out.println("Reverts to original" + emp);
    }
}
