import java.util.Scanner;

// Account Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
}

// Loan Interface
interface Loan {
    void applyLoan(double amount);
}

// Customer Class implementing both interfaces
class Customer implements Account, Loan {

    private String name;
    private double balance;
    private double loanAmount;

    // Constructor
    Customer(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        this.loanAmount = 0;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Apply Loan Method
    public void applyLoan(double amount) {
        if (amount > 0) {
            loanAmount += amount;
            System.out.println("Loan approved: " + amount);
        } else {
            System.out.println("Invalid loan amount!");
        }
    }

    // Display Customer Info
    public void displayDetails() {
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Account Balance: " + balance);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Customer c1 = new Customer(name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        c1.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        c1.withdraw(withdraw);

        System.out.print("Enter Loan Amount: ");
        double loan = sc.nextDouble();
        c1.applyLoan(loan);

        // Final Output
        c1.displayDetails();

        sc.close();
    }
}