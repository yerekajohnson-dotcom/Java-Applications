import java.util.Scanner;

public class FairTaxApproach {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("------Welcome!-----\n");
		
	  // Ask for the expenses in various categories	
    	System.out.print("Enter the cost for housing(rents,utilities and upkeep)> \n");
		double Housing = input.nextDouble();
		
		System.out.print("Enter the cost for Food and Groceries> \n");
		double Food = input.nextDouble();
		
		System.out.print("Enter the cost for Clothing> \n");
		double Clothing = input.nextDouble();
		
		System.out.print("Enter the cost for Transportation(fuel and fares)> \n");
		double Transportation = input.nextDouble();
		 
		System.out.print("Enter the cost for Education(tuition,books)> \n");
		double Education = input.nextDouble();
		
		System.out.print("Enter the cost for Healthcare(Medicine,visits)> \n");
		double Healthcare = input.nextDouble();
		
		System.out.print("Enter the cost for Vacations> \n");
		double Vacations = input.nextDouble();
		
		double totalBeforeTax = 0;
		
		double totalAfterTax= 0;
		
		
		double sumOfExpenses = Housing + Food + Clothing + Transportation + Education + Healthcare + Vacations;
		
		totalBeforeTax = sumOfExpenses;
		
		System.out.printf("The estimated total before taxation is: %.2f%n", totalBeforeTax);
		
		// What is actually paid
		double fairTaxInclusiveRate = totalBeforeTax / 0.77;
		
		totalAfterTax = fairTaxInclusiveRate;
		
		System.out.printf("The estimated total after taxation is: %.2f%n", totalAfterTax);
		
		double taxPortion = totalAfterTax - totalBeforeTax;
		
		System.out.printf("The amount for tax is: %.2f%n", taxPortion);
	}	
}		
		