package Chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = 200.00;
        double commission = 0.09;
        double sales = 0.00;
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        System.out.println("Enter Item number 1-4 or -1 to quit: ");
        int itemNumber = input.nextInt();

        while (itemNumber != -1){
            System.out.println("Enter quantity sold: ");
            int quantity = input.nextInt();

            if (itemNumber == 1){
                sales += quantity * item1;
            }
            else if (itemNumber == 2){
                sales += quantity * item2;
            }
            else if (itemNumber == 3){
                sales += quantity * item3;
            }
            else if (itemNumber == 4){
                sales += quantity * item4;
            } else {
                System.out.println("Invalid item number");
            }
            System.out.println("Enter Item number 1-4 or -1 to quit: ");
            itemNumber = input.nextInt();
        }
        double bonusSalary = salary +(sales * commission);
        System.out.printf("The sales person earnings for the week is $%.2f%n", bonusSalary);

    }
}