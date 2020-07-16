package main.java.com.state;

public class Fan {
    final static int OFF = 0;
    final static int LOW = 1;
    int state = OFF;

    public Fan(){}

    public void pullChain() {
        if (state == OFF){
            System.out.println("Fan is already low");
            state = LOW;
        }
        else if (state == LOW){
            System.out.println("Turning Fan on.");
            state = OFF;
        }
    }

    public String toString(){
        if (state == OFF){
            return "Fan is off";
        }else if (state == LOW){
            return "Fan is on low";
        }else{
            return "Invalid state";
        }

    }
}
