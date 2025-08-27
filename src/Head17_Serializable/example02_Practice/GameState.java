package Head17_Serializable.example02_Practice;

import java.io.*;
import java.time.LocalDateTime;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;

    private String playerName;
    private int level;
    private int experience;
    private int gold;
    private LocalDateTime saveTime;

    private transient boolean isPauses;
    private transient int fps;

    public GameState(String playerName) {
        this.playerName = playerName;
        this.level = 1;
        this.experience = 0;
        this.gold = 100;
        this.saveTime = LocalDateTime.now();
    }

    public static void save(GameState gs, String fileName) {
        try (ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(gs);
            System.out.println("[Info] save success!");
        } catch (IOException e) {
            System.out.println("[Error] save failed: " + e.getMessage());
        }
    }

    public static GameState load(String fileName) {
        try (ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(fileName))) {
            GameState gs = (GameState) ois.readObject();
            System.out.println("[Info] load success!");
            return gs;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("[Error] load failed: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "GameState{" +
                "saveTime=" + saveTime +
                ", gold=" + gold +
                ", experience=" + experience +
                ", level=" + level +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
