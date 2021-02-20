package abstraction.example1;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120) {
            @Override
            public void move() {
                System.out.println("Annonymous inner vehicle implementation");
            }
        };

        vehicle.move();

        Car car = new Car(150);
        car.move();

        SportsCar sportsCar = new SportsCar(195);
        sportsCar.move();

        Vehicle bmw = new Car(180);
        bmw.move();
        Vehicle audi = new SportsCar(220);
        audi.move();

        List<Vehicle> masinos = new ArrayList<>();
        masinos.add(bmw);
        masinos.add(audi);

    }
}
