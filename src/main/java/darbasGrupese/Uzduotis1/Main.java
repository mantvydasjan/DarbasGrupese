package darbasGrupese.Uzduotis1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OS linux = new Linux("Linux", 100, false,"Mint");
        OS mac = new Mac("Mac", 400, false, false);
        OS windows = new Windows("Windows", 800, "10");

        List<OS> osMasyvas = new ArrayList<>();
        osMasyvas.add(linux);
        osMasyvas.add(mac);
        osMasyvas.add(windows);

        Collections.sort(osMasyvas);

        System.out.println(osMasyvas);
        System.out.println("*****************");
        for (OS osMasyva: osMasyvas) {
            System.out.println(osMasyva);
        }
    }

}
