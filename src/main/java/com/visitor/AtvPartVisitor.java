package main.java.com.visitor;

public interface AtvPartVisitor {
    void visit(Oil oil);
    void visit(Fender fender);
    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
