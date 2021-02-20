package darbasGrupese.Uzduotis2;

import java.util.Scanner;

public class ShippingMain {
    public static void main(String[] args) {
        System.out.println("Select shipping method: ");
        System.out.println("1 = shipping by air");
        System.out.println("2 = shipping by ground");
        System.out.println("3 = shipping by sea");
        Scanner scanner = new Scanner(System.in);

        ShipingStrategies strategy = null;

        Product product = new Product("Vegetables", "Green", 500);

        int userInput = scanner.nextInt();

        if (userInput == 1) {
            strategy = new AirShipping();

        } else if (userInput == 2) {
            strategy = new GroundShipping();
        } else {
            strategy = new SeaShipping();
        }
strategy.ship(product);
    }
}
