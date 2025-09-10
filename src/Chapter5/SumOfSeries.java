package Chapter5;

public class SumOfSeries {
    public static void main(String[] args) {
        int number = 1;
        long sum = 0;
        System.out.printf("%5s%10s%n", "numbers", "sum");

        while (number <= 100) {
            sum += number;
            System.out.printf("%5d%11d%n", number, sum);
            number++;
        }
        System.out.printf("The total Sum of the integers is %d", sum);
    }
}
