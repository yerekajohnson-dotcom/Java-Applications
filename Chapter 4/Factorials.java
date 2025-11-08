public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%-20s%n", "Number", "Factorial");
        System.out.println("------------------------------");

        long factorial = 1;

        for (int i = 1; i <= 20; i++) {
            factorial *= i; // multiply previous factorial by i
            System.out.printf("%-10d%-20d%n", i, factorial);
        }
    }
}
