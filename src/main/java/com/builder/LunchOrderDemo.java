package main.java.com.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
    LunchOrder.Builder builder = new LunchOrder.Builder();

    builder.bread("Meat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

    LunchOrder lunchOrder = builder.build();

    System.out.println(lunchOrder.getBread());
    System.out.println(lunchOrder.getCondiments());
    System.out.println(lunchOrder.getDressing());

    }
}
