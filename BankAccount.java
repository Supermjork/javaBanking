import java.time.LocalDate;

public class BankAccount {
    private String accName;
    private static int accID;
    private double accBalance;
    private double annualInterestRate;
    private LocalDate accCreation;
    private String accPass;

    BankAccount(double balance, double annualInterestRate, int day, int month,
                int year, String Password, String holderName) {
        accID += 2069;
        accBalance = balance;
        this.annualInterestRate = annualInterestRate;
        accCreation = LocalDate.of(year, month, day);
        accPass = Password;
        accName = holderName;
    }

    public int getAccID() {
        return accID;
    }

    public String getAccPass() {
        return accPass;
    }

    public boolean passConfirm(String accountPassword) {
        return accPass.equals(accountPassword);
    }

    public void accWithdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Error whilst withdrawing said amount (Amount in negative or 0)");
        } else if(amount > accBalance) {
           System.out.println("You cannot withdraw more than your current balance of " + accBalance);
        } else {
            accBalance -= amount;
            System.out.println("Successfully withdrew " + amount + " from your account," +
                               " Remaining balance: " + accBalance);
        }
    }

    public void accDeposit(double amount) {
        if(amount <= 0) {
            System.out.println("Error whilst depositing said amount (Amount in negative or 0");
        } else {
            accBalance += amount;
            System.out.println("Successfully deposited " + amount + " into your account," +
                               " Current balance: " + accBalance);
        }
    }

    @Override
    public String toString() {
        return " Account Balance: " + accBalance + "\n Account Interest Rate: " + annualInterestRate +
               "\n Account Creation Date: " + accCreation;
    }
}