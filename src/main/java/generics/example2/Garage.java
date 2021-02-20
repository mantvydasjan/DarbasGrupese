package generics.example2;

import java.util.List;
//operate with object type T which extends class Vehicle
public class Garage<T extends Vehicle> { //priimk bet kokia klase, kuri extendina Vehicle
    private List<T> differentCars;
    public Garage(List<T> differentCars) {
        this.differentCars = differentCars;
    }
    public List<T> getDifferentCars() {
        return differentCars;
    }
    public void repairVehicle(Vehicle vehicle) {
        System.out.println("Repairing... " + vehicle.color + " " + vehicle.brand  + " car");
    }
}