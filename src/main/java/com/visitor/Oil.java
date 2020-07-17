package main.java.com.visitor;

public class Oil implements AtvPart  {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
