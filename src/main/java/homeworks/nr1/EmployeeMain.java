package homeworks.nr1;

// 2. Create Employee administration application
//	a) Create class Employee to hold employee specific data like employeeId, name, age, personalCode, salary, position, experience.
//	b) Create two constructors (based on business logic of your program)
//	c) Use encapsulation. Create setters/getters, but only for the fields which are allowed and make sense to update.
//	d) Add validation to the setters. Eg. You can't hire to young or too old person. You have to pay him the salary in specific ranges. You can assign him/her the specific position only.
//		personal code should fit the template/pattern.
//	e) Create class AdministrationService which would be responsible for updating or adding Employee data. Methods can be responsible for updating salary, experience, position.
//	f) Create method to add new employee to the existing employee list.
//	g) Create methods to remove employee or update one.
//	h)* Bonus: Store the data into the text file.
//	j) Create Main class where you will invoke the AdministrationService and prompt the administrator to manipulate the employee data. ()
//
//	Note: It is a must to cover as much functionality as possible with unit tests!
//	Note: You can create more classes if you see a need for that. Remember - one responsibility for one class.

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mantvydas", 1, 28, 25556156, 5000, "programmer", 5);
        Employee employee2 = new Employee("Jonas", 2, 69, 15493345, 1000, "engineer", 2);
        employee2.setAge(70);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
