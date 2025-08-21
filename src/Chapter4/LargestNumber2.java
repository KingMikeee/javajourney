package Chapter4;

import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest1 =  0;
        int largest2 =  0;


        while (counter <= 10 ) {

            System.out.println("Enter the number: ");
            int number = input.nextInt();




            if (number > largest1){
                largest2 = largest1;
                largest1 = number;
            }

           else if (number > largest2 && number != largest1){
                largest2 = number;
            }


            counter++;
        }
        System.out.printf("The first Largest number is %d%n the second largest number is %d%n",largest1, largest2);
    }
}


