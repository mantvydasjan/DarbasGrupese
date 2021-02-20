package enums.example2;

public class GameMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.setName("Devil may cry 4");
        game.setGameLevel(GameLevel.HARD);
        System.out.println("Game is called - " + game.getName());
        System.out.println("Game level is set to " + game.getGameLevel());
        System.out.println("You will be given " + game.getGameLevel().getHealthPoints() + "HP");
        System.out.println("Also your armor is " + game.getGameLevel().getArmorType());
        System.out.println("Good luck ");
    }
}