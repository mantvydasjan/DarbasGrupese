package abstraction.example1;

public class SportsCar extends Vehicle {

    public SportsCar(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Specific SportCar constructor logic...");
    }

    @Override
    public void move() {
        System.out.println("Move very fast like a sport car");

    }

    private void additionalLogic(){
        System.out.println("Additional logic");
    }
}
