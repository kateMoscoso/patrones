package main.java.com.command;

public class CommandDemo {
    public static void main(String args[]){
        Ligth  ligth = new Ligth();
        Switch ligthSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(ligth);

        ligthSwitch.storeAndExecute(toggleCommand);
        ligthSwitch.storeAndExecute(toggleCommand);
        ligthSwitch.storeAndExecute(toggleCommand);
    }
}
