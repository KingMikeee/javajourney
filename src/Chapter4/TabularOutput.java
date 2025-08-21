package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("N   N²  N³  N⁴");
        while (a <= 5){
            System.out.printf("%d   %d   %d   %d%n",a, a*a, a*a*a, a*a*a*a);
            a += 1;
        }
    }
}