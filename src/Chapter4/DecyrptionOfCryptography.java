package Chapter4;

import java.util.Scanner;

public class DecyrptionOfCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digit number to decrypt: ");
        int num = input.nextInt();
        while (num < 1000 || num > 9999){
            System.out.println("Error!! Enter Encrypted 4 digit number: ");
            num = input.nextInt();
        }

        int first = num / 1000;
        int second = (num / 100) % 10;
        int third = (num / 10) % 10;
        int fourth = num % 10 ;

        first = (first + 10 - 7) % 10;
        second = (second + 10 - 7) % 10;
        third = (third + 10 - 7) % 10;
        fourth = (fourth + 10 - 7) % 10;

        System.out.printf("The Decrypted number is %d%d%d%d%n", third, fourth, first, second);


        System.out.println("Done");
    }
}

