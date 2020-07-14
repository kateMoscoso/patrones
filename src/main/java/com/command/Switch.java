package main.java.com.command;

//invoker
public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
