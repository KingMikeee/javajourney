package Chapter3;
import java.util.Scanner;
public class AccountTest2 {
    public  static void main(String[] args) {

        Account2 account1 = new Account2("Jane Green", 50.00);
        Account2 account2 = new Account2("Jane Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter Withdrawal amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%n Withdrawing %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);

        System.out.print("Enter Withdrawal amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%n Withdrawing %.2f from balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        displayAccount(account2);
    }
    public static void displayAccount(Account2 accountToDisplay){
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}