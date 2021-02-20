package lambda.functionalinterfaces;

// Functional interface is threated as SAM interface (single abstract method)

/*
Functional interfaces

1. Predicate[InputType] - Accepts ONE argument and returns boolean result.
2. Consumer[InputType] - Accepts ONE argument but does not return the result.
3. Supplier[OutputType] - does NOT accept arguments but produces ONE result.
4. Function[InputType, OutputType] - Accepts ONE argument and produces ONE result.
*5. UnaryOperator - single argument with a return value.
*6. BinaryOperator - takes two arguments and returns one. (param1, param2) -> expression

 */


public interface FunctionalInterface {
    void execute();
}
