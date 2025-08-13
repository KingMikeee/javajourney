package Chapter4;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest =  0;


        while (counter <= 10 ) {

            System.out.println("Enter the number: ");
            int number = input.nextInt();

            if (number > largest){
                largest = number;
            }

            counter++;
        }
        System.out.printf("The Largest number is %d%n",largest);
    }
}
