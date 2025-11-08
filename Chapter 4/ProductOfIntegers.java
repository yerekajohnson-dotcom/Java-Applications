import java.util.Scanner;

public class ProductOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countStart = 1;
        int countEnd = 15;
        int product = 1;

        while (countStart <= countEnd) {  // include 15th number
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 != 0) {
                System.out.printf("This is an odd number: %d%n", num);
                product = product * num;
            }

            countStart++;
        }

        System.out.printf("This is the product of the odd numbers: %d%n", product);
    }
}
