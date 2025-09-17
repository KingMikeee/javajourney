package Chapter5;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;


        for (int i = 1; i <= 5; i++) {

            do {
                System.out.println("Enter Number " + i + " between (1-30): ");
                n = input.nextInt();
                if (n < 1 || n > 30){
                    System.out.println("Invalid input. Enter a number between 1-30");
                }

            } while (n < 1 || n > 30);

               for (int j =0; j < n; j++){
                   System.out.print('*');
               }
            System.out.println();
        }
    }
}