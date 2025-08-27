package Head17_Serializable.example02_Practice;

public class Game {
    public static void main(String[] args) {
//        GameState gameState = new GameState("JinWoo");
//
//        GameState.save(gameState, "./src/resources/game.ser");

        GameState gameState = GameState.load("./src/resources/game.ser");

        System.out.println(gameState);
    }
}
