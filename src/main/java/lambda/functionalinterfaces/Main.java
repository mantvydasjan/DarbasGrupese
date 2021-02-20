package lambda.functionalinterfaces;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new PredicateService();
        functionalInterface.execute();

        SupplierService supplierService = new SupplierService();
        supplierService.execute();

        functionalInterface = new FunctionService();
        functionalInterface.execute();


        if(true) {
            Function<Integer, Integer> adhocSkaiciuokle = integer -> integer * 2 * integer;
            System.out.println("Greitas paskaiciavimas yra " + adhocSkaiciuokle.apply(58));
            System.out.println("Greitas paskaiciavimas yra " + adhocSkaiciuokle.apply(89));
        }

    }
}
