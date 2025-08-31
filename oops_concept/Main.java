package oops_concept;
/*Create a class BankAccount with variables accountNo and balance.

Write a constructor that initializes values.

If balance is less than 1000, throw an exception inside the constructor. */
class BankAccount {
    String accountNo;
    double balance;

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        if (balance < 1000) {
            throw new IllegalArgumentException("Minimum balance should be 1000");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("12345", 1500);
            BankAccount account2 = new BankAccount("67890", 500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}