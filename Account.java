import java.time.LocalDate;

public class Account {
    int accID;
    double accBal;
    double annualInterestRate;
    LocalDate creationDate;

    Account() {
        accID = 0;
        accBal = 0;
        annualInterestRate = 0;
    }

    Account(int accID, double accBal) {
        this.accID = accID;
        this.accBal = accBal;
    }

    public void setData(int accID, double accBal, double annualInterestRate, int year, int month, int day) {
        this.accID = accID;
        this.accBal = accBal;
        this.annualInterestRate = annualInterestRate / 100;
        this.creationDate = LocalDate.of(year, month, day);
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return accBal * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        accBal -= amount;
    }

    public void deposit(double amount) {
        accBal += amount;
    }

    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.setData(1122, 20000,4.5, 2003, 5, 11);
        acc1.withdraw(2500);
        acc1.deposit(3000);

        System.out.println("Account ID: " + acc1.accID);
        System.out.println("Account Balance: " + acc1.accBal);
        System.out.println("Monthly Interest Amount: " + acc1.getMonthlyInterest());
        System.out.println("Account Creation Date: " + acc1.creationDate);
    }
}