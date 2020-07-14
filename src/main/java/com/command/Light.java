package main.java.com.command;

public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }
    public void toggle(){
        if (isOn){
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light witched on.");
    }

    public void off(){
        System.out.println("Light witched off.");
    }
}
