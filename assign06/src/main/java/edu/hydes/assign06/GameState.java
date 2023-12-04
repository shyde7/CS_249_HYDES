package edu.hydes.assign06;
import java.util.*;

public class GameState implements Loadable{
    public Loadable createLoadable(String typeName) throws GameFileException {
        switch(typeName){
            case "Skeleton":
                return new Skeleton();
            case "Rat":
                return new Rat();
            case "Item":
                return new Item();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }
    public void load(Scanner input) throws GameFileException{

    }
}
