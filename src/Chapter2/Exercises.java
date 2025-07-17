package Chapter2;

import java.util.Scanner;
public class Exercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter an Integer ");
    int integer = input.nextInt();
        System.out.printf("%d%s%n", integer, " was selected");


    System.out.print("Enter Value of c: ");
    int c = input.nextInt();
    System.out.print("Enter Value of b: ");
    int b = input.nextInt();
    int a = b * c;
        System.out.printf("Product is %d%n", a);

        System.out.printf("%d%d%d%d%n", 1, 2, 3, 4);

        System.out.print("Enter first integer: ");
        int d = input.nextInt();

        System.out.print("Enter second integer: ");
        int p = input.nextInt();

        int square1 = d * d;
        int square2 = p * p;
        int sum = square1 + square2;
        int difference = square1 - square2;

        System.out.println("Square of first number: " + square1);
        System.out.println("Square of second number: " + square2);
        System.out.println("Sum of squares: " + sum);
        System.out.println("Difference of squares: " + difference);
        System.out.println("Done");

        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.println("4 ");

        System.out.print("Enter Number: ");
        int e = input.nextInt();
        int squareE = e * e;
        if (squareE == 100)
            System.out.printf("%d == %d%n", squareE, 100);
        if (squareE != 100)
            System.out.printf("%d != %d%n", squareE, 100);
        if (squareE >= 100)
            System.out.printf("%d >= %d%n", squareE, 100);
        if (squareE <= 100)
            System.out.printf("%d <= %d%n", squareE, 100);
        System.out.print("Done");

        System.out.print("Enter first number: ");
        int h = input.nextInt();

        System.out.print("Enter second number: ");
        int g = input.nextInt();

        System.out.print("Enter third number: ");
        int k = input.nextInt();

        int sum1 = h + g + k;
        int product = h * g * k;
        int difference1 = h - g - k;
        int average = (sum1 / 3);
        int smallest = h;
        if (g < smallest) {
            smallest = k;
        }
        if (k < smallest) {
            smallest = k;
        }
        int largest = h;
        if (g > largest) {
            largest = g;
        }
        if (k > largest) {
            largest = k;
        }

        System.out.println("Sum is " + sum1);
        System.out.println("Product is " + product);
        System.out.println("Difference is " + difference1);
        System.out.println("Average is " + average);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
