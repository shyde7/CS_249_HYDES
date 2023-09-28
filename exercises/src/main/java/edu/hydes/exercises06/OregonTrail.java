package edu.hydes.exercises06;
import edu.hydes.exercises03.*;

import java.util.*;

public class OregonTrail {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();
        store.enterStore(supplies, input);
        System.out.println(supplies);
    }
}
