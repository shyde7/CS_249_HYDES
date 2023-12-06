package edu.hydes.assign06;
import java.io.PrintWriter;
import java.util.List;
import java.util.*;
import edu.hydes.assign04.ScreenBuffer;

public class GameState implements Loadable {
    private List<Loadable> loadables = new ArrayList<>();
    private ScreenBuffer baseMap = new ScreenBuffer(12, 30, '.');
    public GameState() {
        loadables = new ArrayList<>();
        baseMap = new ScreenBuffer(12, 30, '.');
    }

    public Loadable createLoadable(String typeName) throws GameFileException {
        switch (typeName) {
            case "Skeleton":
                return new Skeleton();
            case "Rat":
                return new Rat();
            case "Item":
                return new Item();
            case "Tome":
                return new Tome();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }

    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadables.clear();

        int numLines = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable loadable = createLoadable(typeName);
            loadable.load(input);
            loadables.add(loadable);

            if (loadable instanceof Drawable) {
                ((Drawable) loadable).draw(baseMap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(baseMap.getDisplayString()).append("\n");
        sb.append("CREATURES:\n");
        for (Loadable loadable : loadables) {
            if (loadable instanceof Creature) {
                sb.append("* ").append(loadable).append("\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (Loadable loadable : loadables) {
            if (loadable instanceof Item) {
                sb.append("* ").append(loadable).append("\n");
            }
        }
        return sb.toString();
    }

    public void save(String fileName) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(fileName)){
            writer.print(this.toString());
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
