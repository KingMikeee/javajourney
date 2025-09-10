package Chapter5;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number <= 30){
            if ((number % 3) == 0) {
                sum += number;
            }
            number++;

        }
        System.out.printf("The Sum of the integers is %d", sum );
    }
}
