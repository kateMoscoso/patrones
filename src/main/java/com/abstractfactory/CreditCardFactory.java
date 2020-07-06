package main.java.com.abstractfactory;

//abstract factory, just indicate the element needed to implement
public abstract class CreditCardFactory {
    public static CreditCardFactory getCredicCardFactory(int creditScore) {
        if(creditScore > 650){
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }
    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
