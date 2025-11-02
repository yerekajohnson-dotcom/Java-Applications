import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
	  Scanner input = new Scanner(System.in); 
	  
	  System.out.print("------Welcome!------");
	  System.out.print("Enter the name of the SalesPerson: ");
	  System.out.print("Enter the item sold: ");
	  
	  System.out.print("Enter the amount for the item");
	  double Item = input.nextDouble();
	  
	  double TotalEarnings = Item * 0.09;
	  System.out.printf(" This is the total earnings with commision is %d", TotalEarnings );
	  
	  input.close();
	}  
}	  