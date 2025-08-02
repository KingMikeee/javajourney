package Chapter3;
import java.util.Scanner;
public class CarApplication {
    public static void main(String[] args){
        Car car1 = new Car("Audi", "2021", 8000);
        Car car2 = new Car("Toyota", "2025", 12000);

        System.out.printf("The model of the car is %s, it was made in %s and costs %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("The model of the car is %s, it was made in %s and costs %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());
        System.out.println(" ");

        System.out.printf("There is a discount of 5 percent on the Audi making the price %f%n", car1.getNewPrice());
        System.out.printf("There is a discount of 7 percent on the Toyota making the price %f%n", car2.getNewPrice2());




    }

}
