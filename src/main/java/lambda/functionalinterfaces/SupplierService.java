package lambda.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierService implements FunctionalInterface {

    @Override
    public void execute() {
        //Supplier Functional interface - represents supplier of results.
        //Does not accept any arguments
        //BUT - empty artument list is still mandotory () -> expression
        Supplier<String> supplier = () -> "[SUPPLIER] Java is FUN, but confusing. ";
        System.out.println(supplier.get());

        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();
        System.out.println(dateSupplier.get());

    }
}
