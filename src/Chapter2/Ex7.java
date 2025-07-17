package Chapter2;

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();
        if (firstNumber * 3 == secondNumber * 2) {
            System.out.println("The first number tripled is a multiple of the second number doubled.");
        }
        if (firstNumber * 3 != secondNumber * 2) {
            System.out.println("The first number tripled is not a multiple of the second number doubled.");
        }
    }
}

