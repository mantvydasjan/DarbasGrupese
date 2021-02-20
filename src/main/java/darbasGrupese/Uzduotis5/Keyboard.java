package darbasGrupese.Uzduotis5;

public class Keyboard extends Gadget {
    private String language;

    public Keyboard(String brand, int price, String language) {
        super(brand, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
