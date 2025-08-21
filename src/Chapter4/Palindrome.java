package Chapter4;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digit number");
        int number = input.nextInt();

        while (number < 10000) {
            System.out.println("Error: Number must be five digits.");
            System.out.print("Try again: ");
            number = input.nextInt();
        }
        while (number > 99999) {
            System.out.println("Error: Number must be five digits.");
            System.out.print("Try again: ");
            number = input.nextInt();
        }
        int first = number / 10000;
        int second = (number / 1000) % 10;
        int third = (number / 100) % 10;
        int fourth = (number / 10) % 10;
        int fifth = number % 10;

        if (first == fifth && second == fourth){
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
