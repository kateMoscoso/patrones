package main.java.com.command;

public class Ligth {

    private boolean isOn = false;

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
        System.out.println("Ligth witched on.");
    }

    public void off(){
        System.out.println("Ligth witched off.");
    }
}
