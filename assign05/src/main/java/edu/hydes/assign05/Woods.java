package edu.hydes.assign05;

import java.util.*;

public class Woods {
    private ArrayList<Giant> giants = new ArrayList<>();
public Woods(){
    giants = new ArrayList<>();
}
    public Giant createGiant(String name, String typeName){
        if(name.isEmpty()){
            return null;
        }
        switch(typeName.toUpperCase()) {
            case "GIANT":
                return new Giant(name);
            case "TROLL":
                return new Troll(name);
            case "TREE":
                return new Tree(name);
            case "ENT":
                return new Ent(name);
            case "HUORN":
                return new Huorn(name);
            default:
                return null;
        }
    }

    public boolean addGiant(String name, String typeName){
        Giant newGiant = createGiant(name, typeName);
        if(newGiant != null){
            giants.add(newGiant);
            return true;
        } else {
            return false;
        }
    }

    public Giant getGiant(int index){
        if(index >= 0 && index < giants.size()){
            return giants.get(index);
        } else {
            return null;
        }
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(Giant giant : giants){
            System.out.println("- " + giant.toString());
        }
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(Giant giant: giants){
            if(giant instanceof Tree){
                Tree tree = (Tree) giant;
                System.out.println("- " + tree.toString()
                                   + ": " + tree.speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(Giant giant: giants){
            if(giant instanceof Troll){
                Troll troll = (Troll) giant;
                System.out.println("- " + troll.toString()
                                   + ": " + troll.cook());
            }
        }
    }
}
