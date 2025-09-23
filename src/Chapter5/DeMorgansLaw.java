package Chapter5;

public class DeMorgansLaw {
    public static void main(String[] args) {
        int x = 2; int y = 3; int a = 4; int b = 5;
        int g = 6; int i = 7; int j = 8;

        boolean originalA = !(x < 5) && !(y >= 7);
        boolean newA = ! ((x < 5) || (y >= 7));
        System.out.println("a) Original: " + originalA + ", Equivalent: " + newA);

        boolean originalB = !(a == b) || !(g != 5) ;
        boolean newB = !((a == b) && (g != 5));
        System.out.println("b) Original: " + originalB + ", Equivalent: " + newB);

        boolean originalC = !((x <= 8) && (y > 4)) ;
        boolean newC = !(x <= 8) || !(y > 4);
        System.out.println("c) Original: " + originalC + ", Equivalent: " + newC);

        boolean originalD = !((i > 4) || (j <= 6)) ;
        boolean newD = !(i > 4) && !(j <= 6);
        System.out.println("d) Original: " + originalD + ", Equivalent: " + newD);


    }
}
