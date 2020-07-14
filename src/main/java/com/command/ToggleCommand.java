package main.java.com.command;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.toggle();
    }
}
