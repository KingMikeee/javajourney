package Chapter5;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        do {
            System.out.println("Enter and odd number from 1 - 19");
            rows = input.nextInt();
        } while (rows < 1 || rows > 19 || rows % 2 == 0);

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int space = 1; space <= rows - i; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}