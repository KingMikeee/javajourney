package Chapter3;

public class AccountTest1 {
    public static void main(String[] args) {

        Account account1 = new Account("Ken Red");
        Account account2 = new Account("Ken Blue");

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
}
