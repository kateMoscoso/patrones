package main.java.com.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard( new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2021");
        amexCard.setCvv("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard( new AmexStrategy());

        amexCard2.setNumber("379185883564283");
        amexCard2.setDate("04/2021");
        amexCard2.setCvv("123");

        System.out.println("Is amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard( new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/2021");
        visaCard.setCvv("123");

        System.out.println("Is visa valid: " + visaCard.isValid());

    }
}
