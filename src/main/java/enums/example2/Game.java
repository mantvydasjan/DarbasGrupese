package enums.example2;

public class Game {
    private String name;
    //Composition
    private GameLevel gameLevel;
    public String getName() {
        return name;
    }
    public GameLevel getGameLevel() {
        return gameLevel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }
}