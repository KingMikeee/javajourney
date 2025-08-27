package Chapter4;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        //Population growth display
        long p = 8235252251L;
        int year = 1;
        double r = 0.0085;

        System.out.printf("The current world Population is %d people.%n", p );


        System.out.print(" ");
        System.out.println("Year               Population                Population increase");

        while (year <= 75){
            double population1 = (long)(p * (1 + r));
            long newpop = (long) population1;
            long increase = newpop - p;

            System.out.printf(" Year%d               %d                %d%n",year, newpop, increase );

            p = newpop;
            year++;

        }
}
}
