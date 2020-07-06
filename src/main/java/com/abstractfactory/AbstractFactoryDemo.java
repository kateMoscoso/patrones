package main.java.com.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        CreditCardFactory abstractFactory = CreditCardFactory.getCredicCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCredicCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card.getClass());

    }
}
