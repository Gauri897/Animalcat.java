class BankAccount {
    double balance = 500;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Withdrawal denied. Minimum balance ₹100 required.");
        } else {
            super.withdraw(amount);
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.withdraw(450);
        System.out.println("Balance: ₹" + acc.getBalance());
    }
}
