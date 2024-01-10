import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNumber, String accType) {
        customerName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    void displayBalance() {
        System.out.println("Account balance for " + customerName + ": $" + balance);
    }
}

class CurrAcct extends Account {
    double minimumBalance;
    double serviceCharge;

    CurrAcct(String name, int accNumber, double minBalance) {
        super(name, accNumber, "Current");
        minimumBalance = minBalance;
        serviceCharge = 10.0;
    }

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of $" + serviceCharge + " applied. New balance: $" + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class SavAcct extends Account {
    double interestRate;

    SavAcct(String name, int accNumber, double interestRate) {
        super(name, accNumber, "Savings");
        this.interestRate = interestRate;
    }

    void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. New balance: $" + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for name and account number
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        // Example usage with user input
        CurrAcct currentAccount = new CurrAcct(customerName, accountNumber, 1000.0);
        SavAcct savingsAccount = new SavAcct(customerName, accountNumber, 5.0);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute interest for Savings account");
            System.out.println("4. Display Account details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    savingsAccount.computeInterest();
                    break;
                case 4:
                    currentAccount.displayBalance();
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }
}



