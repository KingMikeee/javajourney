package Chapter5;

public class PythagoreanTriples {
    public static void main(String[] args ){
        System.out.printf("%-10s%-10s%-10s%n", "Side1", "Side2", "Hypothenus");
        for(int side1 = 1; side1 <= 500; side1++){
            for(int side2 = side1; side2 <= 500; side2++){
                for(int hypothenus = side2; hypothenus <= 500; hypothenus++){
                    if((side1 * side1) + (side2 * side2) == hypothenus * hypothenus)
                        System.out.printf("%10s%-10s%-10s%n", side1, side2, hypothenus);

                }
            }
        }
    }
}
