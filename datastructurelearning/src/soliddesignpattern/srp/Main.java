package soliddesignpattern.srp;

import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1);
        account.setFirstName("Elan");
        account.setTotalAmount(BigDecimal.valueOf(10000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        new TransactionOperations().deposit(1,BigDecimal.valueOf(20000));

        System.out.println(account.toString());
    }
}
