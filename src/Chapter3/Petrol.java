package Chapter3;
import java.util.Scanner;
public class Petrol {
    public static void main(String[] args){

PetrolPurchase purchase = new PetrolPurchase("", "", 0, 0.00, 0.00);
Scanner input = new Scanner(System.in);

System.out.println("Enter Location: ");
String location = input.nextLine();
purchase.setLocation(location);

System.out.println("Enter Petrol Type: ");
String petrolType = input.nextLine();
purchase.setPetrolType(petrolType);

System.out.println("Enter Quantity of petrol purchased: ");
int quantity = input.nextInt();
purchase.setQuantity(quantity);


System.out.println("Enter Price of petrol per litre: ");
double price = input.nextDouble();
purchase.setPrice(price);

System.out.println("Enter discount received: ");
double discount = input.nextDouble();
purchase.setDiscount(discount);

System.out.printf("The petrol was purchased in %s%n", purchase.getLocation());
System.out.printf("The petrol Type is %s%n", purchase.getPetrolType());
System.out.printf("The quantity of petrol that is purchased is %d liters%n", purchase.getQuantity());
System.out.printf("The price of petrol purchased in $%.2f%n", purchase.getPrice());
System.out.printf("The discount on the petrol that was purchased is %.2f%n", purchase.getDiscount());
System.out.printf("The amount paid after subtracting the discount is $%.2f%n", purchase.getPurchaseAmount());
    }
}
