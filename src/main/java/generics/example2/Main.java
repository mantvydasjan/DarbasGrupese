package generics.example2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW("red", "320");
        Audi audi = new Audi("black", "Q5");
        List<Vehicle> cars = Arrays.asList(bmw, audi, new BMW("orange", "X5"));
        List<BMW> bmwCars = Arrays.asList(bmw, new BMW("orange", "X5"));

        List<Zigulys> ziguliai = Arrays.asList(new Zigulys());

        Garage garage = new Garage(cars);

        for (Vehicle car : cars) {
            garage.repairVehicle(car);
        }

    }
}
