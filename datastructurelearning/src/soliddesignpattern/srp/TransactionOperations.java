package soliddesignpattern.srp;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(int accountNumber, BigDecimal amount){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withDraw(int accountNumber, BigDecimal amount){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
