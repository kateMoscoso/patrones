package main.java.com.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;
    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fender");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels");
    }

    @Override
    public void visit(PartsOrder order) {
        List<AtvPart> parts = order.getParts();
        if(parts.size() > 3){
            shippingAmount += 5;
        }
        System.out.println(" shippingAmount " + shippingAmount);
    }
}
