package Chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int n = 1; n <= 5; n++) {
            System.out.println("Enter a Number between 1 and 30: ");
            int num = input.nextInt();

            while (num < 1 || num > 30){
                System.out.print("Invalid input. Enter another number");
                num = input.nextInt();
            }

            for (int j = 0; j < num; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
