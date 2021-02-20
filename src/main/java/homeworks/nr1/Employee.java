package homeworks.nr1;

public class Employee {

    private String name;
    private int employeeId;
    private int age;
    private int personalCode;
    private int salary;
    private String position;
    private int experience;


    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }


    public Employee(String name, int employeeId, int age, int personalCode, int salary, String position, int experience) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.personalCode = personalCode;
        this.salary = salary;
        this.position = position;
        this.experience = experience;
    }

    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setAge(int age) {

        if (this.age < 18) {
            System.out.println("Person to young for hiring.");
        } else if (this.age > 60) {
            System.out.println("Person to old for hiring");
        } else age = this.age;
    }


    public void setSalary(int salary) {
        if (599 < this.salary && this.salary < 5001) {
            this.salary = salary;
        } else {
            System.out.println("Salary out of range");
        }
    }

    public void setPosition(String position) {

        if (this.position.equals("engineer"))

        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", experience=" + experience +
                '}';
    }

}


