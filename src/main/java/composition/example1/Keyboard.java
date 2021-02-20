package composition.example1;

//Keyboard related logic ONLY
public class Keyboard {
    private int price;
    private String brand;
    public Keyboard(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        //connection to datbase
        //check web services
        //get brand from konkurentai
        //add prefix
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /*
    Keyboard specific behavior
    Logika susijusi TIK SU KLAVIATURA
    SINGE RESPONSIBLITY
     */
}