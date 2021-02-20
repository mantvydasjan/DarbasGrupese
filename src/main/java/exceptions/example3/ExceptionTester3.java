package exceptions.example3;

public class ExceptionTester3 {
    public static void main(String[] args) {
        int[] masyvas = {1, 2};
        System.out.println("Programa prasideda");

        try {
            masyvas[3]=5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Netinkamas masyvo elementas");
            masyvas[0]=55;
        } finally {
            System.out.println("Vykdomas GALE");//atliekam uzbaigiamuosius veiksmus
        }
        System.out.println(masyvas[0]);
    }
}
