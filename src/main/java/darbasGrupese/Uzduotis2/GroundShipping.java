package darbasGrupese.Uzduotis2;

public class GroundShipping implements ShipingStrategies {
    @Override
    public void ship(Product product) {
        System.out.println("Shipping by ground");
        System.out.println(product);
    }
}
