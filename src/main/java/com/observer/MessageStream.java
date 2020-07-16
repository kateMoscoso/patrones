package main.java.com.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

    @Override
    String getSate() {
        return messageHistory.getLast();
    }
}
