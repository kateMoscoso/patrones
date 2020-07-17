package main.java.com.state;

public class FanMedState extends State {
    private Fan fan;

    public FanMedState(Fan fan){
        this.fan = fan;
    }
    public void handleRequest(){
        System.out.println("Turning fan on to off");
        fan.setState(fan.getFanOffState());
    }

    public String toString(){
        return "Fan is med";
    }
}