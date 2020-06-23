package main.java.com.chainresponsability;

import javax.print.attribute.standard.RequestingUserName;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
    public abstract void handleRequest(Request request);
}
