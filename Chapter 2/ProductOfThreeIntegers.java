
public class ProductOfThreeIntegers {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        Declare the variables x, y, z, and result to be of type int.
        int x, y, z, result;

        //Prompt the user to enter the first integer.
        System.out.print("Enter first integer: ");
        
        x = input.nextInt();

        //Prompt the user to enter the second integer.
        System.out.print("Enter second integer: ");
        
        y = input.nextInt();

        //Prompt the user to enter the third integer.
        System.out.print("Enter third integer: ");
        // i) Read the third integer from the user and store it in the variable z.
        z = input.nextInt();

        //Compute the product of the three integers and assign it to result.
        result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}
