package inheritance.example3;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();

        //audi is-a CAR
        Audi audi = new Audi();
        audi.startCar();

        //volco yra CAR
        Volvo volvo = new Volvo();
        volvo.startCar();

        //polimorphism - daug formu
        //car gali tureti daugybe formu
        //pvz audi arba volvo

        Car audiCar = new Audi();
        audiCar.startCar();
        Car volvoCar = new Car();
        volvoCar.startCar();

        List<Audi> cars = new ArrayList<>();
        cars.add(audi);

        List<Car> automobiliai = new ArrayList<>();
        automobiliai.add(audiCar);
        automobiliai.add(volvoCar);

    }
}
