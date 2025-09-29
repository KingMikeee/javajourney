package Chapter5;

import java.util.Scanner;

public class FairtaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transportation, education, healthCare, vacations;

        System.out.print("Enter your monthly housing expenses: $");
        housing = input.nextDouble();

        System.out.print("Enter your monthly food expenses: $");
        food = input.nextDouble();

        System.out.print("Enter your monthly clothing expenses: $");
        clothing = input.nextDouble();

        System.out.print("Enter your monthly transportation expenses: $");
        transportation = input.nextDouble();

        System.out.print("Enter your monthly education expenses: $");
        education = input.nextDouble();

        System.out.print("Enter your monthly health care expenses: $");
        healthCare = input.nextDouble();

        System.out.print("Enter your monthly vacation expenses: $");
        vacations = input.nextDouble();

        double total = housing + food + clothing + transportation + education + healthCare + vacations;
        double fairTax = total * 0.23;

        System.out.printf("%nYour total monthly spending is: $%.2f%n", total);
        System.out.println();
        System.out.printf("Your estimated FairTax for 23%% is: $%.2f%n", fairTax);

        double fairTax2 = total * 0.30;
        System.out.printf("Your estimated FairTax for 30%% would be: $%.2f%n", fairTax2);
    }
}
