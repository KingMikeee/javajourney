package Chapter4;
import  java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber = 0;
        System.out.println("Enter account number or -1 to quit: ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.println("Enter Balance at the beginning of the month: ");
            int balance = input.nextInt();
            System.out.println("Enter total charges: ");
            int charges = input.nextInt();
            System.out.println("Enter total credit: ");
            int credit = input.nextInt();
            System.out.println("Enter allowed credit for the month: ");
            int allowedCredit = input.nextInt();
            int newBalance = (balance + charges)- credit;
            System.out.printf("New balance is %d%n", newBalance);
            String result = (newBalance > credit) ? "Credit limit not exceeded" : "Credit limit exceeded";
            System.out.println(result);
            System.out.println("Enter account number or -1 to quit: ");
            accountNumber = input.nextInt();
        }

        System.out.println("Done");

    }
}