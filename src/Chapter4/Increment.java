package Chapter4;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before post increment: %d%n", c);
        System.out.printf("post incrementing c: %d%n", c++);
        System.out.printf("c after post increment: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf("c before post increment: %d%n", c);
        System.out.printf("post incrementing c: %d%n", ++c);
        System.out.printf("c after post increment: %d%n", c);
    }
}
