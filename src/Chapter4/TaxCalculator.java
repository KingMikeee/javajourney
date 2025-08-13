package Chapter4;
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double earnings = 0.00;
        double rate1 = 0.15;
        double rate2 = 0.20;
        double tax = 0.00;
        int counter = 1;

        System.out.println("Enter Citizen name: ");
        String name = input.nextLine();

        while (counter <= 3){
            counter += 1;
            System.out.println("Enter amount earned in the year: ");
            earnings = input.nextDouble();
            if (earnings <= 30000.00){
                tax = earnings * rate1;
            } else {
                tax = earnings * rate2;
            }
            System.out.printf("The tax paid by %s at the end of the year is $%.2f%n", name, tax);

            System.out.println("Enter Citizen name: ");
            name = input.next();


        }
        System.out.println("Done");
    }
}
