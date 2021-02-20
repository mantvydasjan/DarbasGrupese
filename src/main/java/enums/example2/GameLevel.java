package enums.example2;

//Represents specific ranged predefined data
//Needed when we need specific values like expires, valid, cancelled
//0, ne 1 - approved, 2- declined, 3 - pending
public enum GameLevel {
    //jei zaidziama EASY leveliu, turim 300 HP, ir gaunama armora Golden
    EASY(300,"Golden"),
    MEDIUM(200, "Metal"),
    HARD(100, "Wooden"),
    HARDCORE(50, "Cloth");
    //jei norime papildomu kintamuju, juos turime sukurti cia
    private int healthPoints;
    private String armorType;
    //reikalingas konstruktorius, jei norime tureti papildomu reiksmiu
    GameLevel(int healthPoints, String armorType) {
        this.healthPoints = healthPoints;
        this.armorType = armorType;
    }
    public int getHealthPoints() {
        return healthPoints;
    }
    public String getArmorType() {
        return armorType;
    }
}