import java.util.Scanner;

public class investmentDouble {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your initial investment:");
        int investmentAmount = userInput.nextInt();

        System.out.println("Enter your interest per year:");
        double interest = userInput.nextDouble() / 100;

        double yrsUntilDouble = Math.log(2) / (Math.log(1 + interest));

        System.out.print("The amount of years to double your investment is " + yrsUntilDouble);
    }
}
