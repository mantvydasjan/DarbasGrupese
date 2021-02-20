package inheritance.example2;


//IS-A MountinBike IS_A Bicycle
public class MountainBike extends Bicycle{

    public int seatHigh;


    public MountainBike(int gear, int speed, int seatHigh) {
        super(gear, speed);
        this.seatHigh = seatHigh;
    }
    public MountainBike() {

    }

    @Override
    public void commonBicycleBehavior() {
        // super.commonBicycleBehavior(); tevines klases elgesys
        System.out.println("asdasd");
    }

}
