package collections.example1;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        List<String> eiluciuSarasas = new ArrayList<>();
        eiluciuSarasas.add("Labas");

        Set<String> rinkinys = new HashSet<>();
        rinkinys.add("Labbas");

        Map<String, Integer> mapas = new HashMap<>();
        mapas.put("Jonaitis", 86465132);

        //List

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(84);
        listOfIntegers.add(1);
        listOfIntegers.add(8);
        listOfIntegers.add(54);
        listOfIntegers.add(32);

        for (Integer singleInteger : listOfIntegers) {
            System.out.println(singleInteger);
        }

        listOfIntegers.stream().forEach((s) -> System.out.println(s));

        //set

        Set<String> names = new HashSet<>();
        names.add("Dario");
        names.add("Luigi");
        names.add("Mario");

        System.out.println(names);

        //map

        Map<Integer, Integer> skaiciuMapas = new HashMap<>();

        skaiciuMapas.put(5, 2);
        skaiciuMapas.put(1, 6);
        skaiciuMapas.put(8, 2);

        Map<Integer, List<String>> telefonuKnyga = new HashMap<>();
        List<String> vardai = Arrays.asList("Tomas", "Darius", "Povilas");
        List<String> kitiVardai = Arrays.asList("Samanta", "Sandra", "Monika", "Dovile");

        telefonuKnyga.put(1, vardai);
        telefonuKnyga.put(2, kitiVardai);

        System.out.println(telefonuKnyga);

        System.out.println(telefonuKnyga.get(2).get(3));

        telefonuKnyga.put(3, Arrays.asList("Bill", "Tom"));

        for (List<String> varduSarasas : telefonuKnyga.values()) {
            for(String vardasIsSaraso : varduSarasas) {
                System.out.println("Vardas sarase - " + vardasIsSaraso);
            }

        }


    }
}
