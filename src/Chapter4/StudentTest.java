package Chapter4;

public class StudentTest {
    public static void main(String[] args){
        Student account1 = new Student("Jack Black", 87.4);
        Student account2 = new Student("Jack White", 42.0);

        System.out.printf("%s letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s letter grade is: %s%n", account2.getName(), account2.getLetterGrade());

    }
}
