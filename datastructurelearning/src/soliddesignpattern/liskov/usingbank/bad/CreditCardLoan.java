package soliddesignpattern.liskov.usingbank.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("It is not available");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("It is not available");
    }
}
