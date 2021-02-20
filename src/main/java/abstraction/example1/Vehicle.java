package abstraction.example1;

public abstract class Vehicle {

    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Kontrakto salyga
    public abstract void move();

}
