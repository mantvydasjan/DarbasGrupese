package abstraction.example2;

/*
-Abstract class can not be instantiated (no object creation with NEW keyword)
-Extends keyword needs to be used to use the CLASS
-Might include abstract methods.
-Fields, non-abstract, static methods work in regular way (as in regular class)

Purpose of abstraction - hide implementation details from client (class that extends it)

-Abstract class defines what OBJECT IS
-Interface defines what OBJECT does (what can do) Interface is purely abstract. IMPLEMENTS

-An abstract class can have shared state of functionality
-Interface is promse that the class will implement the methods.
 */

public class AbstractDemo {

    public static void main(String[] args) {

        Bank swedbank = new SwedBank();
        swedbank.deposit();
        swedbank.withdraw();
        swedbank.calculateSpecificBankTax();

        Bank seb = new SEB();
        seb.deposit();
        seb.withdraw();
        seb.calculateSpecificBankTax();

    }

}

abstract class Bank {
    public int commonBankTax = 5;

    public void deposit() {
        System.out.println("Common deposit method for all banks");
    }

    public void withdraw() {
        System.out.println("Common withdraw method for all banks");

    }

    public abstract void calculateSpecificBankTax();

}

class SwedBank extends Bank {

    @Override
    public void calculateSpecificBankTax() {
        System.out.println("Swedbank tax amount - " + 15);
        System.out.println("Common bank tax applies - " + commonBankTax);
    }
}

class SEB extends Bank {

        @Override
        public void calculateSpecificBankTax() {
            System.out.println("Swedbank tax amount - " + 17);
            System.out.println("Common bank tax applies - " + commonBankTax);
        }
}
