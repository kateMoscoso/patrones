package main.java.com.command;


//concrete command
public class OnCommand implements Command {

    private Ligth ligth;

    public OnCommand(Ligth ligth) {
        this.ligth = ligth;
    }

    @Override
    public void execute() {
        ligth.on();
    }
}
