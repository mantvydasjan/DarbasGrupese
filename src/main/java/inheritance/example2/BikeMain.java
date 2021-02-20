package inheritance.example2;

public class BikeMain {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(); // HAS ONLY Bicycle functionality
        System.out.println(bicycle);

        Bicycle anotherBicycle = new Bicycle (5,8);
        System.out.println(anotherBicycle);

        MountainBike mountainBike = new MountainBike(); // Has Bicycle functionality ant mountainBicycle functionality
        System.out.println(mountainBike);

        MountainBike anotherMB = new MountainBike(1,2, 3);
        System.out.println(anotherMB);

        //Verify IS-A relationships

        boolean isBicycleIsABicycle = bicycle instanceof Bicycle;
        System.out.println(isBicycleIsABicycle);
        boolean isMountainBikeABicycle = mountainBike instanceof Bicycle;
        System.out.println(isMountainBikeABicycle);
        boolean isMountainBikeAmountainBike = mountainBike instanceof MountainBike;
        System.out.println(isMountainBikeAmountainBike);

    }
}
