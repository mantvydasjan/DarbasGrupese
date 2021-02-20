package enums.example3;

public class ProgrammerMain {
    public static void main(String[] args) {
        System.out.println(Programmer.LEAD);
        System.out.println(Programmer.MID.getExperience());

        for(Programmer programmer : Programmer.values()) {
            System.out.println(programmer + " has years of experience " + programmer.getExperience());
            System.out.println("Salary is - " + programmer.getSalary());
        }

    }
}
