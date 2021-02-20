package encapsulation.example1;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Mantvydas");
        System.out.println(person);


        Person anotherPerson = new Person("Mantvydas", "Jankauskas", 28, 80, 186);
        System.out.println(anotherPerson);

        anotherPerson.setAge(29);
        System.out.println(anotherPerson);

    }
}
