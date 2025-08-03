package Chapter3;

import java.util.Scanner;

public class ClockApplication {
    public static void main(String[] args){
        Clock time = new Clock(0, 0, 0);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Hour: ");
        int hour = input.nextInt();
        time.setHour(hour);

        System.out.println("Enter minute: ");
        int minute = input.nextInt();
        time.setMinute(minute);

        System.out.println("Enter second: ");
        int second = input.nextInt();
        time.setSecond(second);

        System.out.printf("The time is %d:%d:%d", time.getHour(), time.getMinute(),time.getSecond());
    }
}
