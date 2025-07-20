package Chapter2;
import java.util.Scanner;
public class Making_A_Difference1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Ex 2.33 Body Mass Index Calculator(BMI)
        System.out.println("Enter Weight in Kg: ");
        int w = input.nextInt();
        System.out.println("Enter Height in meters: ");
        int m = input.nextInt();

        int BMI = w/(m*m);
                System.out.println("Your BMI is: " + BMI);


    }
}
