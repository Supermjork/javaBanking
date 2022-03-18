import java.util.Scanner;

public class investmentReturn {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your invested amount: ");
        int investedAmount = userInput.nextInt();

        System.out.println("Enter your interest per year (In %)");
        double interestRate = userInput.nextDouble() / 100;

        System.out.println("Enter how many years you want to calculate its resulted amount");
        int years = userInput.nextInt();

        double futureAmount = investedAmount * Math.pow((1 + (interestRate)), years);

        System.out.print("The return of your investment in " + years + " is: " + futureAmount);
    }
}
