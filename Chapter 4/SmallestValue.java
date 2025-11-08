import java.util.Scanner;

public class SmallestValue{
   public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

	  System.out.print("Enter a number to determine the loop count: \n");
	  int count = input.nextInt();
	  
	  int num = 1;
        System.out.print("Enter number: ");
        int smallest = input.nextInt();
        num++;
	  
	  while(num <= count){
		System.out.print("Enter a number: \n");
		int ynum = input.nextInt();
		
		
	   if(ynum < smallest){
          smallest = ynum;	  
	   }
	   
	   num++;
	  } 
	  
	  System.out.printf("The smallest number is: \n%d", smallest);
   }
}   
	   