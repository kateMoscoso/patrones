package main.java.com.command;

public class ToggleCommand implements Command {

    private Ligth ligth;

    public ToggleCommand(Ligth ligth){
        this.ligth = ligth;
    }
    @Override
    public void execute() {
        ligth.toggle();
    }
}
