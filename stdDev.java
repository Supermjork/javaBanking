import java.util.Scanner;
import java.util.Arrays;

public class stdDev {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double[] elements = new double[10];
		int sumAvg = 0;
		double sumDiv = 0.0;
		
		System.out.println("Enter 10 elements");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("elements[" + (i + 1) + "]");
			elements[i] = userInput.nextInt();
			sumAvg += elements[i];
		}
		
		double m = (double) sumAvg / elements.length;
		
		for(int i = 0; i < 10; i++) {
			elements[i] = Math.pow((elements[i] - m), 2);
			sumDiv += elements[i];
		}
		
		double stdDevVal = Math.sqrt(sumDiv/ elements.length);
		
		System.out.println("Standard Deviation = " + stdDevVal);
		
		userInput.close();
	}
}