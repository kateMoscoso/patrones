package main.java.com.visitor;

public class Wheel implements AtvPart  {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
