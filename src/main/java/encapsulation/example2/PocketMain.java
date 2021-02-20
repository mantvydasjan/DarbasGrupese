package encapsulation.example2;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(50);
        System.out.println("Kiseneje yra " + pocket.showMoney() + " euru");
        pocket.setMoney(50);
        System.out.println("Dabar kiseneje yra " + pocket.showMoney() + " euru");
        pocket.setMoney(-10);
        pocket.setMoney(3001);
        pocket.getMoney(80);
        System.out.println("Dabar kiseneje liko: " + pocket.showMoney() + "euru");
        pocket.getMoney(15);
        System.out.println("Dabar kiseneje liko: " + pocket.showMoney() + "euru");
    }
}
