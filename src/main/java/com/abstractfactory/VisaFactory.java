package main.java.com.abstractfactory;

public class VisaFactory  extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
