package enums.example3;

public enum Programmer {

    JUNIOR(1, 2000),
    MID(2, 2000),
    SENIOR(3, 3000),
    LEAD(5, 5000);



    private int experience;
    private int salary;

    Programmer(int experience, int salary) {
        this.experience = experience;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer ENUM experience and salary values { " +
                + experience + " years, " + salary + " Eur }";
    }
}
