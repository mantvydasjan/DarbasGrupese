package darbasGrupese.Uzduotis5;

import java.util.ArrayList;
import java.util.List;

public class PCMain {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor(17, "Sony", 800);
        Processor processor1 = new Processor("Intel", 240);
        Mouse mouse = new Mouse("Logitech", 290);
        Keyboard keyboard = new Keyboard("Spi", 6, "Russian");

        List<Gadget> gadget = new ArrayList<>();
        gadget.add(mouse);
        gadget.add(keyboard);


        PC pc = new PC(monitor1, processor1, gadget);
        System.out.println(pc);
        System.out.println(pc);

    }
}
