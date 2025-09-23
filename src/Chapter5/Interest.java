package Chapter5;

public class Interest {
    public static void main(String[] args) {
        int principalPennies = 100000;

        for (int rate = 5; rate <= 10; rate += 1) {
            System.out.printf("%nThe interest rate is: %d%n", rate);
            System.out.printf("%s%20s%n", "Year", "Amount of deposit");

            for (int year = 1; year <= 10; year++) {
                int amountPennies = principalPennies;

                for (int i =0; i < year; i++){
                    amountPennies = amountPennies *(100 + rate) / 100;
                }
                int dollars = amountPennies / 100;
                int cents = amountPennies % 100;

                System.out.printf("%4d%,20d.%02d%n", year, dollars, cents);

            } 
        }
    }
}