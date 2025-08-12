package Chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = 200.00;
        double commission = 0.09;
        double sales = 0.00;
        System.out.println("Enter value of item sold or -1 to quit: ");
        sales = input.nextInt();
    }
}