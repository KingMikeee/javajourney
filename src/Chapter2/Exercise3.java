package Chapter2;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     System.out.println("Enter the radius of the circle: ");
    double radius = input.nextDouble();


        System.out.printf("Diameter: %f%n", 2 * radius);
        System.out.printf("Circumference: %f%n", 2 * 3.14159 * radius);
        System.out.printf("Area: %f%n", 3.14159 * radius * radius);
        System.out.println("Done");






    }
}
