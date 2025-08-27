package Chapter4;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number ");
            int number = input.nextInt();

            int integerSum = 0;

            while (integerSum <= number){

                System.out.println("Enter integers to add up");
                int integer = input.nextInt();
                integerSum += integer;
            }
            System.out.printf("The sum of the integers %d is is now greater than or equal to %d", integerSum, number);
        }
    }

