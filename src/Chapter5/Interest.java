package Chapter5;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.00;

        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%nThe interest rate is: %.0f%n", rate * 100.);
            System.out.printf("%s%20s%n", "Year", "Amount of deposit");

            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.2f%n", year, amount);

            }
        }
    }
}