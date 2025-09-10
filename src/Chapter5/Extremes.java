package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many integers do you want to enter:");
        int counter = input.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < counter; i++ ){
            System.out.println("Enter integer #" + (i + 1) + ": ");
            int number = input.nextInt();

            if (number < min ){
                min = number;}
            if (number > max){
                max = number;}
        }
        int sum = min + max;
        System.out.printf("The minimum number is: %d%n", min);
        System.out.printf("The maximum number is: %d%n", max);
        System.out.printf("The Sum of the two extremes is : %d%n", sum);
    }
}
