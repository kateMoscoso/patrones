package main.java.com.chainresponsability;

public class ChainOfResponsabilityDemo {
    public static void main(String [] args) {
        Director lucia = new Director();
        VP mike = new VP();
        CEO charlie = new CEO();

        lucia.setSuccessor(mike);
        mike.setSuccessor(charlie);

        Request request = new Request(RequestType.CONFERENCE, 500);
        lucia.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        lucia.handleRequest(request);

        request =  new Request(RequestType.PURCHASE, 2000);
        lucia.handleRequest(request);
    }
}
