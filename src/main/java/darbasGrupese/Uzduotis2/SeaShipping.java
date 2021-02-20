package darbasGrupese.Uzduotis2;

public class SeaShipping implements ShipingStrategies {

    @Override
    public void ship(Product product) {
        System.out.println("Shipping by sea");
        System.out.println(product);
    }
}
