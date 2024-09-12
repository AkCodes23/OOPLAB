class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    Account(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
class SavingsAccount extends Account {
    double interestRate = 0.04;

    SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends Account {
    double minBalance = 5000;
    double serviceTax = 100;

    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceTax;
            System.out.println("Service tax imposed: " + serviceTax);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Akhil", 12345, 10000);
        sa.deposit(2000);
        sa.displayBalance();
        sa.computeAndDepositInterest();
        sa.displayBalance();
        sa.withdraw(5000);
        sa.displayBalance();

        CurrentAccount ca = new CurrentAccount("Suraj", 67890, 4500);
        ca.deposit(1500);
        ca.displayBalance();
        ca.checkMinBalance();
        ca.withdraw(2000);
        ca.displayBalance();
        ca.checkMinBalance();
        ca.displayBalance();
    }
}
