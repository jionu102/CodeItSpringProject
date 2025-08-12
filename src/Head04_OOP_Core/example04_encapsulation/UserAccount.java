package Head04_OOP_Core.example04_encapsulation;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("0보다 커야 합니다.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || balance < amount) throw new IllegalStateException("0보다 작거나 잔액이 부족합니다.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
