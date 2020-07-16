package main.java.com.observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
