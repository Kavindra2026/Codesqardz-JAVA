
import java.util.Scanner;

class BankAccount {

    private String AccountHolder;
    private int AccountNumber;
    private double Balance;

    public BankAccount(String AccountHolder, int AccountNumber, double Balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        if (Balance >= 0) {
            this.Balance = Balance;
        } else {
            this.Balance = 0;
            System.out.println("Balance cannot be negative. Set a balance to 0.");
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.Balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + this.Balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= this.Balance) {
            this.Balance -= amount;
            System.out.println("Withdraw: " + amount + " | New Balance: " + this.Balance);

        } else {
            System.out.println("Insufficient balance or Invalid amount.");
        }
    }

    public double getBalance() {
        return Balance;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

}

class BankAccountMain {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Kavindra Singh", 123456, 1000.0);
        System.out.println("Welcome to the Bank Account Management System");
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("AccountNo :" + myAccount.getAccountNumber());
        System.out.println("Balance : " + myAccount.getBalance());
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("Choice a Number :");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw ");
            System.out.println("3. Deposit ");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + myAccount.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }

        } while (choice != 4);
    }
}
