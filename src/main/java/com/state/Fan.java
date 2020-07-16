package main.java.com.state;

public class Fan {
    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;
    int state = OFF;

    public Fan(){}

    public void pullChain() {
        if (state == OFF){
            System.out.println("Fan is already low");
            state = LOW;
        }
        else if (state == LOW){
            System.out.println("Turning Fan on to med.");
            state = MED;
        }
        else if(state == MED){
            System.out.println("Turning Fan on to off");
            state = OFF;
        }
    }

    public String toString(){
        if (state == OFF){
            return "Fan is off";
        }else if (state == LOW){
            return "Fan is on low";
        }else if (state == MED){
            return "Fan is on med";
        } else{
            return "Invalid state";
        }

    }
}
