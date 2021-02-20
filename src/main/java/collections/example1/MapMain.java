package collections.example1;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        /*
        MAP - key value pairs, no duplicate keys.
         */
        Map<String, String> zodynas = new HashMap<>();
        zodynas.put("Stalas", "Daiktas ant kurio dedame kitus daiktus");
        zodynas.put("Kede", "daiktas ant kurio sedime");
        zodynas.put("Suo", "Gyvas daiktas, kuris loja");
        //Istraukiam visus irasus - EntrySet
        for (Map.Entry<String, String> irasas : zodynas.entrySet()) {
            System.out.println(irasas.getKey() + " - " + irasas.getValue());
        }
        //Istraukiam visus raktus - KeySet
        for (String raktas : zodynas.keySet()) {
            System.out.println(raktas);
        }
        //Istraukiam visas reiksmes - values
        for (String reiksme : zodynas.values()) {
            System.out.println(reiksme);
        }
        System.out.println(zodynas.get("Suo"));
        zodynas.remove("Kede");
        System.out.println(zodynas);
    }
}