package Chapter2;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        System.out.print("Enter the fourth number: ");
        int d = input.nextInt();
        System.out.print("Enter the fifth number: ");
        int e = input.nextInt();

        int smallest = a;
        int largest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (d < smallest) {
            smallest = d;
        }
        if (e < smallest) {
            smallest = e;
        }

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if (d > largest) {
            largest = d;
        }
        if (e > largest) {
            largest = e;
        }


        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);


    }
}