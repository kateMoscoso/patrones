package main.java.com.observer;

public class ObserverDemo {
    public static void main (String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        //TableClient tableClient = new TableClient(subject);

        phoneClient.addMessage("Here is a new message!");
        //tobletClient.addMessage("Another new message!");
    }
}
