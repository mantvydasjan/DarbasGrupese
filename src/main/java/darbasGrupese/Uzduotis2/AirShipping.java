package darbasGrupese.Uzduotis2;

public class AirShipping implements ShipingStrategies {
    @Override
    public void ship(Product product) {
        System.out.println("Shipping by air");
        System.out.println(product);
    }
}
