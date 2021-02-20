package lambda.functionalinterfaces;


import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionService implements FunctionalInterface {

    @Override
    public void execute() {
        //Accepts one argument, produces one result
        //First argument input of type T
        //Second argument output of type R result.
        //(params) -> expression
        //Skliaustu reikia jeigu daugiau nei 1 parametras
        Function<String, Integer> lengthFunction = givenString -> givenString.length();
        System.out.println("[FUNCTION 1] Length of labadiena is " + lengthFunction.apply("labadiena"));

        Function<Integer, Integer> multiplierFunction = givenNumber -> givenNumber * 2;
        Integer daugybosRezultatas = multiplierFunction.apply(8);
        System.out.println("[FUNCTION 2] Skaicius 8 padaugintas is 2 yra" + daugybosRezultatas);

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b *5;
        System.out.println("[BiFUNCTION 1] skaicius 1 * 5 * 5" + biFunction.apply(1, 5));


    }
}
