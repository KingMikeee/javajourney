package Chapter3;

import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args){
        HeartRates patient = new HeartRates("", "",  "", 0, 0);

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

        System.out.printf("Hello %s %s.%n", patient.getFirstname(), patient.getLastname());
        System.out.printf("Your date of birth is %d %s %d, therefore you are %d years old.%n", patient.getDayOfBirth(), patient.getMonthOfBirth(), patient.getYearOfBirth(), patient.getAge());
        System.out.println(" ");
        System.out.printf("Your maximum heart rate in beats per minute is %d%n", patient.getRate());
        System.out.printf("Your target heart rate range is between %.2f - %.2f beats per minute", patient.getTargetRate(), patient.getTargetRate1());








        }
    }

