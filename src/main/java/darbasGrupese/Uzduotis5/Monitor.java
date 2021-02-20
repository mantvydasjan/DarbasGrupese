package darbasGrupese.Uzduotis5;

public class Monitor {
    private int size;
    private String brand;
    private int totalprice;

    public Monitor(int size, String brand, int totalprice) {
        this.size = size;
        this.brand = brand;
        this.totalprice = totalprice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", totalprice=" + totalprice +
                '}';
    }
}





