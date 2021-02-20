package inheritance.example2;

public class Bicycle {

    public int gear;
    public int speed;

    public Bicycle() {

    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }



    public void commonBicycleBehavior() {
        System.out.println("Behaving like a Bicycle");
    }
    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
