package main.java.com.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);

    abstract String getSate();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
