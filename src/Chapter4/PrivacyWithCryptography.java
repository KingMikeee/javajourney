package Chapter4;

import java.util.Scanner;

public class PrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        int num = input.nextInt();
        while (num < 1000 || num > 9999){
            System.out.println("Error!! Enter 4 digit number: ");
            num = input.nextInt();
        }

            int first = num / 1000;
            int second = (num / 100) % 10;
            int third = (num / 10) % 10;
            int fourth = num % 10 ;

            first = (first + 7) % 10;
            second = (second + 7) % 10;
            third = (third + 7) % 10;
            fourth = (fourth + 7) % 10;


            System.out.printf("The Encrypted number is %d%d%d%d%n", third, fourth, first, second);
        System.out.println("Done");
    }
}