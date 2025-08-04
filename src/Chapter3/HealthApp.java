package Chapter3;
import java.util.Scanner;
public class HealthApp {
    public static void main(String[] args){
        HealthProfile patient = new HealthProfile("", "",  "", 0, 0, 0.00,0.00);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First name");
        String firstname = input.nextLine();
        patient.setFirstname(firstname);

        System.out.println("Enter your Last name");
        String lastname = input.nextLine();
        patient.setLastname(lastname);

        System.out.println("Enter your Month of birth");
        String monthOfBirth= input.nextLine();
        patient.setMonthOfBirth(monthOfBirth);

        System.out.println("Enter your Day of birth");
        int dayOfBirth = input.nextInt();
        patient.setDayOfBirth(dayOfBirth);

        System.out.println("Enter your Year of birth");
        int yearOfBirth  = input.nextInt();
        patient.setYearOfBirth(yearOfBirth);

        System.out.println("Enter your Height in inches");
        double height  = input.nextDouble();
        patient.setHeight(height);

        System.out.println("Enter your weight in pounds");
        double weight  = input.nextDouble();
        patient.setWeight(weight);

        System.out.println(" ");
        System.out.printf("Hello %s %s.%n", patient.getFirstname(), patient.getLastname());
        System.out.printf("Your date of birth is %d %s %d, therefore you are %d years old.%n", patient.getDayOfBirth(), patient.getMonthOfBirth(), patient.getYearOfBirth(), patient.getAge());
        System.out.println(" ");
        System.out.printf("Your maximum heart rate in beats per minute is %d.%n", patient.getRate());
        System.out.printf("Your target heart rate range is between %.2f - %.2f beats per minute.%n", patient.getTargetRate(), patient.getTargetRate1());
        System.out.println(" ");
        System.out.printf("Your height in inches is %.2f.%n", patient.getHeight());
        System.out.printf("Your weight in pounds is %.2f.%n", patient.getWeight());
        System.out.printf("Your BMI is %.2f.%n", patient.getBMI());
    }
}
