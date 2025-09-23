package Chapter5;

public class ValueOfPi {
    public static void main(String[] args) {
        double pi = 0.00;
        int sign = 1;


        for (int v = 0; v <= 200000; v += 1) {
            pi += sign * (1.0 / (2 * v + 1));
            sign *= -1;

            double piApprox = pi * 4;

            if ((int)(piApprox * 100000) == 314159) {
                System.out.println("Reached 3.14159 at term: " + v);
                break;
            }
        }
    }
}
