package Chapter4;
import java.util.Scanner;
public class GasMilage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        double totalMiles = 0;
        double totalGallons = 0;


        System.out.println("Enter miles driven or -1 to quit: ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.println("Enter amount of gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon obtained for this trip is: %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;
            double totalMpg = (double) totalMiles / totalGallons;
            System.out.printf("Total Miles per gallon obtained is: %.2f%n", totalMpg);


            System.out.print("Enter miles driven or -1 to quit: ");
            miles = input.nextInt();
        }
        System.out.printf("Total Miles driven is: %.2f%n", totalMiles);
        System.out.printf("Total gallons used is: %.2f%n", totalGallons);
        System.out.println(" ");
        System.out.println("Done");
    }
}
