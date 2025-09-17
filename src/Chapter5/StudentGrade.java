package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr grades in A, B, C, or D");


            for (int i = 1; i <= 5; i++) {
                System.out.printf("Student %d name: ", i);
                String name = input.next();
                System.out.printf("Student %d grade: ", i);
                char grade = input.next().toUpperCase().charAt(0);



                switch (grade) {
                    case 'A':
                        ++aCount;
                        break;
                    case 'B':
                        ++bCount;
                        break;
                    case 'C':
                        ++cCount;
                        break;
                    case 'D':
                        ++dCount;
                        break;
                    default:
                        System.out.println("Invalid grade. Please Enter A, B, C, or D.");
                        i--;
                }
            }
            System.out.printf("%nGrade Report:%n");

                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:", "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount);

            }
    }


