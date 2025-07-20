package Chapter2;

public class Making_A_Difference3 {
    public static void main(String[] args){

double w = 2300000.0; //number of stones
double x = 2.5; // average weight
double y = 26.0; //number of years it took
double t = 227760.0; //hours in 26 years
double h = 13665600.0; //minutes in 26 years

double total_weight = w * x;

double q = total_weight / y ;
        System.out.println("The weight of the pyramid built each year is "+q+ " tonnes");

  double r = total_weight / t;
        System.out.println("The weight of the pyramid built each hour is "+r+ " tonnes");

        double z = total_weight / h;
        System.out.println("The weight of the pyramid built each minutes is "+z+ " tonnes");


    }
}
