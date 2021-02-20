package collections.example1;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        /*
        No duplicates allowed.
        Return elements in non predictable order.
         */

        Set<String> computerNames = new HashSet<>();
        computerNames.add("HP");
        computerNames.add("Dell");
        computerNames.add("Asus");
        computerNames.add("Mac");
        computerNames.add("Mac");

        System.out.println(computerNames);

    }

}
