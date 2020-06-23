package main.java.com.chainresponsability;

import java.net.StandardSocketOptions;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Director can approve confferences");
        }
        else  {
            successor.handleRequest(request);
        }
    }
}
