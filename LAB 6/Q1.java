class Account {
    String customerName;
    int accNo;
    String accountType;
    double balance;

    Account(String customerName, int accNo, String accountType) {
        this.customerName = customerName;
        this.accNo = accNo;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String customerName, int accNo) {
        super(customerName, accNo, "Savings");
        this.interestRate = 0.04; // 4% interest rate
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added. Updated balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CurrentAccount extends Account {
    double minimumBalance;

    CurrentAccount(String customerName, int accNo) {
        super(customerName, accNo, "Current");
        this.minimumBalance = 1000.0; // Minimum balance requirement
    }

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            double penalty = 50.0; // Penalty for low balance
            balance -= penalty;
            System.out.println("Minimum balance not maintained. Penalty imposed. Updated balance: " + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            checkMinimumBalance();
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Akhil", 12345);
        CurrentAccount current = new CurrentAccount("HMM", 67890);

        savings.deposit(2000);
        savings.computeAndDepositInterest();
        savings.withdraw(500);
        savings.displayBalance();

        current.deposit(500);
        current.withdraw(200);
        current.displayBalance();
    }
}
