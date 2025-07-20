package Chapter2;

public class Making_A_Difference2 {
    public static void main(String[] args) {

        //Population growth display
        double p = 8235252251.0;

        System.out.printf("The current world Population is %f people.%n", p );
        double r = 0.0085;

        System.out.printf("The annual world population growth rate is " + r +"%n");
        double Year1 = p * (1 + r);
        double Year2 = Year1 *(1 + r);
        double Year3 = Year2 * (1 + r);
        double Year4 = Year3 * (1 + r);
        double Year5 = Year4 * (1 + r);

        System.out.printf("The world Population after 1 year is %f%n", Year1);
        System.out.printf("The world Population after 2 year is %f%n", Year2);
        System.out.printf("The world Population after 3 year is %f%n", Year3);
        System.out.printf("The world Population after 4 year is %f%n", Year4);
        System.out.printf("The world Population after 5 year is %f%n", Year5);


    }
}