package darbasGrupese.Uzduotis5;

import java.util.List;

public class PC {
    private Monitor monitor;
    private Processor processor;
    List<Gadget> computerGadget;
    private int totalPrice;

    public int getTotalPrice() {
        for (Gadget gadget : computerGadget) {
            totalPrice = gadget.getPrice();
        }

        return totalPrice ;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PC(Monitor monitor, Processor processor, List<Gadget> computerGadget) {
        this.monitor = monitor;
        this.processor = processor;
        this.computerGadget = computerGadget;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public List<Gadget> getComputerGadget() {
        return computerGadget;
    }

    public void setComputerGadget(List<Gadget> computerGadget) {
        this.computerGadget = computerGadget;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", processor=" + processor +
                ", computerGadget=" + computerGadget +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


