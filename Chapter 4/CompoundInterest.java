public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount
        int years = 10;            // total number of years

        System.out.printf("%-10s%-15s%-15s%n", "Rate", "Year", "Amount on Deposit");
        System.out.println("------------------------------------------------");

        // Loop for interest rates from 5% to 10%
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%nInterest Rate: %.0f%%%n", rate * 100);

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-10s%-15d$%,.2f%n", "", year, amount);
            }
        }
    }
}
