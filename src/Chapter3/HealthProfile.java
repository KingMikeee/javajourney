package Chapter3;

public class HealthProfile {
    private String firstname;
    private String lastname;
    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstname, String lastname, String monthOfBirth, int dayOfBirth, int yearOfBirth, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setHeight(double height) {
        if (height > 0.00) {
            this.height = height;
        }
    }

    public void setWeight(double weight) {
        if (weight > 0.00) {
            this.weight = weight;
        }
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    public int getAge() {
        int age = 2025 - yearOfBirth;
        return age;
    }
    public int getRate() {
        int rate = 220 - getAge();
        return rate;
    }
    public double getTargetRate() {
        double Target = getRate() * (0.50);
        return Target;
    }
    public double getTargetRate1() {
        double Target1 = getRate() * (0.85);
        return Target1;
    }
    public double getBMI() {
        double BMI = (getWeight() * 703.00) / (getHeight() * getHeight());
        return BMI;

    }
}
