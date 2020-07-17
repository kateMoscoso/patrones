package main.java.com.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor{
    @Override
    public void visit(Oil oil) {
        System.out.println("Have oil");

    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Have fender");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Have wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Have an order");
    }
}
