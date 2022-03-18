import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class BankSys {
    private static int icenID;

    public static void main(String[] args) {
        HashMap<Integer, BankAccount> icenList = new HashMap<>();

        Scanner userInput0 = new Scanner(System.in);
        int userChoice;

        Scanner userInputInt = new Scanner(System.in);
        Scanner userInputStr = new Scanner(System.in);

        do {
            System.out.print("Welcome to <bankName>, Enter the number of the following Operations to proceed: \n");
            System.out.println(" 1.Account Creation \n 2.Account Info View \n 3.Withdraw" +
                               " \n 4.Deposit \n -1.Exit");
            userChoice = userInput0.nextInt();

            switch (userChoice) {
                case 1:
                    LocalDate dateNow = LocalDate.now();
                    int dayNow = dateNow.getDayOfMonth();
                    int monthNow = dateNow.getMonthValue();
                    int yearNow = dateNow.getYear();

                    System.out.print("Enter account name: ");
                    String accName = userInputStr.nextLine();

                    System.out.print("Enter your Account password:");
                    String accPwd = userInputStr.nextLine();

                    BankAccount newAccount = new BankAccount(0,0,
                                                             dayNow, monthNow, yearNow, accPwd, accName);
                    icenList.put(newAccount.getAccID(), newAccount);

                    System.out.println("Your account ID: " + newAccount.getAccID());
                    break;

                case 2:
                    if(userLogIn(icenList)) {
                        System.out.println(icenList.get(icenID));
                    } else {
                        System.out.println("Login Failed");
                    }
                    break;

                case 3:
                    if(userLogIn(icenList)) {
                        System.out.println("Insert amount you want to withdraw: ");
                        int withdrawAmount = userInputInt.nextInt();

                        icenList.get(icenID).accWithdraw(withdrawAmount);
                    } else {
                        System.out.println("Login Failed");
                    }
                    break;

                case 4:
                    if(userLogIn(icenList)) {
                        System.out.println("Insert amount you would like to deposit: ");
                        int depositAmount = userInputInt.nextInt();

                        icenList.get(icenID).accDeposit(depositAmount);
                    } else {
                        System.out.println("Logic Failed");
                    }
                    break;

                default:
                    System.out.println("Exiting");
            }
        } while(userChoice != -1);
    }

    public static boolean userLogIn(HashMap<Integer, BankAccount> accountList) {
        Scanner userInputInt = new Scanner(System.in);
        Scanner userInputStr = new Scanner(System.in);

        System.out.print("What is your Account ID? \n");
        int requestedID = userInputInt.nextInt();

        if(accountList.containsKey(requestedID)) {
            System.out.println("Enter account password: ");
            String passIn = userInputStr.nextLine();

            if (accountList.get(requestedID).getAccPass().equals(passIn)) {
                icenID = requestedID;
                return  true;
            } else {
                System.out.println("Wrong Password.");
                return false;
            }
        } else {
            System.out.println("Account Non-existent");
            return false;
        }
    }
}