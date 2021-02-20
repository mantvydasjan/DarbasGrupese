package lambda.functionalinterfaces;

/*

It is called functional interface becouse it acts as a function.
CAN HAVE ONLY one abstract method BUT Lots of default implementation.

 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateService implements FunctionalInterface {

    @Override
    public void execute() {

        //predicate needs and input type
        //tikriname ar eilute yra ilgesne negu 10
        //(parameter) -> expression to evaluate

        Predicate<String> longerThanTen = (givenString) -> givenString.length() > 10;
        boolean isStringLongerThan10Symbols = longerThanTen.test("TestEilute");
        System.out.println("[PREDICATE] test string is longer than 10 symbols - " + isStringLongerThan10Symbols);

        List<String> names = Arrays.asList("Angela", "Aaron", "Bill", "Clair", "David");

      //  Predicate<String> namesWithPredicate = name -> name.startsWith("A");

        List<String> namesWithA = names.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .collect(Collectors.toList());
        System.out.println("[PREDICATE 2] names starts with A letter" + namesWithA);

    }
}
