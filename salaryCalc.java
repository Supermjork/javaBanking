
public class salaryCalc {

	public static void main(String[] args) {
		
		int numChild = 3;
        double salaryBase, childSupport, transportSupport, houseSupport, salaryTotal, govTax;
        
        salaryBase = 800;
        childSupport = salaryBase * (numChild * 0.05);
        transportSupport = salaryBase * 0.1;
        houseSupport = salaryBase * 0.15;
        salaryTotal = salaryBase + childSupport + transportSupport + houseSupport;
        govTax = salaryTotal * 0.12;

        System.out.println("An employee with basic salary = $" + salaryBase + " and number of child = " + numChild +
                " will have benefits on child support = $" + Math.round(childSupport) + ", \n transportation support = $" + transportSupport +
                " and housing support = $" + houseSupport);
        System.out.println("The net salary of the employee = $" + salaryTotal);
        System.out.println("The paid tax on the net salary = $" + govTax);

	}

}